public static main void(String[] args)
{
  // Read in the number of objects for union find
  int N = StdIn.readInt();
  
  // Implement a new union find object
  UF uf = new UF(N);
  
  while(!StdIn.isEmpty())
  {
    int p = StdIn.readInt();
    int q = StdIn.readInt();
    if (!uf.connected(p, q))
    {
      uf.union(p, q);
      StdOut.println(p + " " + q);
    }
  }
}
