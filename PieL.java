/* PieL.java */
/* Generated By:JavaCC: Do not edit this line. PieL.java */
import java.util.*;
import java.io.*;

public class PieL implements PieLConstants {



    public static void main(String args[]) throws ParseException {
    try{

        PieL parser = new PieL(System.in);


        HashMap mp = new HashMap();

        boolean func = true;

            while(func){
               func= parser.Input(mp);
            }


  }
       catch (Throwable e)
       {
           System.out.println(e.getMessage());
       }
}

  final public boolean Input(HashMap mp) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 119:{
      jj_consume_token(119);
{if ("" != null) return false;}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:
        case 120:
        case 123:
        case 127:
        case 131:
        case 132:
        case 133:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        Statement(mp);
        jj_consume_token(DOT);
      }
{if ("" != null) return true;}
    }
    throw new Error("Missing return statement in function");
  }

  final public void Statement(HashMap mp) throws ParseException {Token j=null,k=null,l=null,m=null,t=null, n=null,o=null;
StringBuilder sb = new StringBuilder();
        Boolean check=null,persist=false;
    if (jj_2_2(2)) {
      jj_consume_token(120);
      j = jj_consume_token(TYPE);
      jj_consume_token(121);
      k = jj_consume_token(ID);
      jj_consume_token(122);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case STRING:{
        l = jj_consume_token(STRING);
        break;
        }
      case NUMBER:{
        l = jj_consume_token(NUMBER);
        break;
        }
      case ID:{
        l = jj_consume_token(ID);
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
if(j.image.equals("numero")){mp.put(k.image,Double.parseDouble(l.image));}
        else if(j.image.equals("estrin")){mp.put(k.image,l.image);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 123:{
        jj_consume_token(123);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:{
          j = jj_consume_token(ID);
          break;
          }
        case NUMBER:{
          j = jj_consume_token(NUMBER);
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        l = jj_consume_token(OP);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NUMBER:{
          m = jj_consume_token(NUMBER);
          break;
          }
        case ID:{
          m = jj_consume_token(ID);
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(124);
token = getNextToken();
while (!token.image.equals("}"))
              {

                                sb.append(token.image);
                                 token = getNextToken();
              }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case RCURLYBRACE:{
          jj_consume_token(RCURLYBRACE);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          ;
        }
try{

                boolean verify=false;
                Double a,b;
                if(j.kind == ID){
                        a=(Double)mp.get(j.image);
                        }
                else{a = Double.parseDouble(j.image);}

                if(m.kind == ID){
                        b=(Double)mp.get(m.image);
                        }
                else{b = Double.parseDouble(m.image);}

                int nums = Double.compare(a,b);

                if(l.image.equals("es igual a")){verify= nums==0;}
                else if(l.image.equals("es mayor que")){verify= nums>0;}
                else if(l.image.equals("es menor que")){verify= nums<0;}
                else if(l.image.equals("es igual o mayor que")){verify= nums>=0;}
                else if(l.image.equals("es igual o menor que")){verify=nums<=0;}
                else if(l.image.equals("no es igual a")){verify=nums!=0;}
                //System.out.println("Here and"+verify);
                while(verify)
                {
                PrintWriter writer = new PrintWriter("printReader.txt", "UTF-8");
                writer.println(sb.toString());
                writer.println("Termina.");
                writer.close();
                PieL parse2 = new PieL(new FileInputStream("printReader.txt"));
                boolean func2 = true;
            while(func2){
               func2= parse2.Input(mp);
            }
                        //System.out.println("Here and"+mp.get("X"));
                        if(j.kind == ID){
                        a=(Double)mp.get(j.image);
                        }
                else{a = Double.parseDouble(j.image);}

                if(m.kind == ID){
                        b=(Double)mp.get(m.image);
                        }
                else{b = Double.parseDouble(m.image);}

                 nums = Double.compare(a,b);

                if(l.image.equals("es igual a")){verify= nums==0;}
                else if(l.image.equals("es mayor que")){verify= nums>0;}
                else if(l.image.equals("es menor que")){verify= nums<0;}
                else if(l.image.equals("es igual o mayor que")){verify= nums>=0;}
                else if(l.image.equals("es igual o menor que")){verify=nums<=0;}
                else if(l.image.equals("no es igual a")){verify=nums!=0;}

                }
        }
        catch(Exception E){}
        break;
        }
      case 120:{
        jj_consume_token(120);
        k = jj_consume_token(STRUCT);
        jj_consume_token(125);
        t = jj_consume_token(TYPE);
        jj_consume_token(121);
        l = jj_consume_token(ID);
        jj_consume_token(126);
        j = jj_consume_token(MULTITERM);
        jj_consume_token(RSQUAREBRACKET);
String[] lister = j.image.split(",");
        if(t.image.equals("numero")){
                ArrayList<Double> list = new ArrayList<Double>();
        for(String x:lister)
        {
                list.add(Double.parseDouble(x));
        }

         mp.put(l.image,list);
        }
        else
        {
        ArrayList<String> list = new ArrayList<String>();
                for(String x:lister)
        {
                list.add(x);
        }
         mp.put(l.image,list);
        }
        break;
        }
      case 127:{
        jj_consume_token(127);
        check = Conds(mp);
        jj_consume_token(128);
if(check){Input(mp); persist=true;}
                else{
                        while (!token.image.equals("}"))
              {
                token = getNextToken();
              }



                }
        if (jj_2_1(2)) {
          jj_consume_token(RCURLYBRACE);
        } else {
          ;
        }
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case 129:{
            ;
            break;
            }
          default:
            jj_la1[6] = jj_gen;
            break label_2;
          }
          jj_consume_token(129);
if(!persist){check=Conds(mp);}else{check=false;}
          jj_consume_token(128);
if(check){Input(mp);persist=true;}
                else{
                        while (!token.image.equals("}"))
              {
                token = getNextToken();
              }



                }
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case RCURLYBRACE:{
          jj_consume_token(RCURLYBRACE);
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 130:{
          jj_consume_token(130);
if(!persist)
        {Input(mp);}
        else{
                        while (!token.image.equals("}"))
              {
                token = getNextToken();
              }



                }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case RCURLYBRACE:{
            jj_consume_token(RCURLYBRACE);
            break;
            }
          default:
            jj_la1[8] = jj_gen;
            ;
          }
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          ;
        }

        break;
        }
      case 131:{
        jj_consume_token(131);
        m = jj_consume_token(ID);
System.out.println(mp.get(m.image));
        break;
        }
      case 132:{
        jj_consume_token(132);
        m = jj_consume_token(ID);
System.out.println(Arrays.asList(mp.get(m.image)));
        break;
        }
      case 133:{
        jj_consume_token(133);
        m = jj_consume_token(NUMBER);
        jj_consume_token(134);
        k = jj_consume_token(ID);
ArrayList<Object> list = (ArrayList<Object>)(mp.get(k.image));

        System.out.println(list.get(Integer.parseInt(m.image)-1));
        break;
        }
      case ID:{
        j = jj_consume_token(ID);
        jj_consume_token(135);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:{
          k = jj_consume_token(ID);
          break;
          }
        case NUMBER:{
          k = jj_consume_token(NUMBER);
          break;
          }
        case STRING:{
          k = jj_consume_token(STRING);
          break;
          }
        case 136:{
          jj_consume_token(136);
          k = jj_consume_token(NUMBER);
          jj_consume_token(134);
          t = jj_consume_token(ID);
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ARITH:{
          l = jj_consume_token(ARITH);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case ID:{
            m = jj_consume_token(ID);
            break;
            }
          case NUMBER:{
            m = jj_consume_token(NUMBER);
            break;
            }
          case 136:{
            jj_consume_token(136);
            n = jj_consume_token(NUMBER);
            jj_consume_token(134);
            o = jj_consume_token(ID);
            break;
            }
          default:
            jj_la1[11] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          ;
        }
if(l==null&&t==null)
                {
                        if(k.kind == ID){mp.put(j.image,mp.get(k.image));}
                        else if (k.kind == NUMBER){mp.put(j.image,Double.parseDouble(k.image));}
                        else if(k.kind == STRING) {mp.put(j.image,k.image);}


                }
                else if(l==null&t!=null)
                {
                        ArrayList<Object> list = (ArrayList<Object>)(mp.get(t.image));

                        mp.put(j.image,list.get(Integer.parseInt(k.image)-1));
                }
                else if(o==null&&t==null)
                {
                        //System.out.println("Here and"+mp.get("X"));
                        Double a=null,b=null;
                        if(k.kind ==ID){a= (Double)mp.get(k.image);}
                        else if(k.kind ==NUMBER){a=Double.parseDouble(k.image);}
                        if(m.kind ==ID){b= (Double)mp.get(m.image);}
                        else if(m.kind ==NUMBER){b=Double.parseDouble(m.image);}
                        //System.out.println(a+" and "+b);
                        if(l.image.contains("por")){mp.put(j.image,a*b);}
                        else if (l.image.contains("entre")){mp.put(j.image,a/b);}
                        else if (l.image.contains("mas")){mp.put(j.image,a+b);}
                        else if (l.image.contains("menos")){mp.put(j.image,a-b);}
                        else if (l.image.contains("modulo")){mp.put(j.image,a%b);}


                }
                else if(t!=null&&o==null)
                {
                        ArrayList<Object> list = (ArrayList<Object>)(mp.get(t.image));
                        Double a=(Double)list.get(Integer.parseInt(k.image)-1),b=null;

                        if(m.kind ==ID){b= (Double)mp.get(m.image);}
                        else if(m.kind ==NUMBER){b=Double.parseDouble(m.image);}

                        if(l.image.equals("por")){mp.put(j.image,a*b);}
                        else if (l.image.equals("entre")){mp.put(j.image,a/b);}
                        else if (l.image.equals("mas")){mp.put(j.image,a+b);}
                        else if (l.image.equals("menos")){mp.put(j.image,a-b);}
                        else if (l.image.equals("modulo")){mp.put(j.image,a%b);}

                }
                else if (o!=null&&t==null){
                        ArrayList<Object> list = (ArrayList<Object>)(mp.get(o.image));
                        Double b=(Double)list.get(Integer.parseInt(n.image)-1),a=null;

                        if(k.kind ==ID){a= (Double)mp.get(k.image);}
                        else if(k.kind ==NUMBER){a=Double.parseDouble(k.image);}

                        if(l.image.equals("por")){mp.put(j.image,a*b);}
                        else if (l.image.equals("entre")){mp.put(j.image,a/b);}
                        else if (l.image.equals("mas")){mp.put(j.image,a+b);}
                        else if (l.image.equals("menos")){mp.put(j.image,a-b);}
                        else if (l.image.equals("modulo")){mp.put(j.image,a%b);}
                }

                else{
                        ArrayList<Object> listt = (ArrayList<Object>)(mp.get(t.image));
                        ArrayList<Object> listo = (ArrayList<Object>)(mp.get(o.image));
                        Double a=(Double)listt.get(Integer.parseInt(k.image)-1),b=(Double)listo.get(Integer.parseInt(n.image)-1);



                        if(l.image.equals("por")){mp.put(j.image,a*b);}
                        else if (l.image.equals("entre")){mp.put(j.image,a/b);}
                        else if (l.image.equals("mas")){mp.put(j.image,a+b);}
                        else if (l.image.equals("menos")){mp.put(j.image,a-b);}
                        else if (l.image.equals("modulo")){mp.put(j.image,a%b);}
                }
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public boolean Conds(HashMap mp) throws ParseException {Token i,j,k;
Double a=null,b=null;
String c=null,d=null;
Boolean check=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING:{
      i = jj_consume_token(STRING);
      break;
      }
    case NUMBER:{
      i = jj_consume_token(NUMBER);
      break;
      }
    case ID:{
      i = jj_consume_token(ID);
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    j = jj_consume_token(OP);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING:{
      k = jj_consume_token(STRING);
      break;
      }
    case NUMBER:{
      k = jj_consume_token(NUMBER);
      break;
      }
    case ID:{
      k = jj_consume_token(ID);
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_3:
    while (true) {
      if (jj_2_3(3)) {
        ;
      } else {
        break label_3;
      }
      jj_consume_token(137);
      check = Conds(mp);
    }
if(i.kind==ID&&!mp.get(i.image).toString().contains("\u005c"")){a=(Double)mp.get(i.image);}
                else if(i.kind==ID){c=mp.get(i.image).toString();}
                else if(i.kind==NUMBER){a=Double.parseDouble(i.image);}
                else{c=i.image;}
                if(k.kind==ID&&!mp.get(k.image).toString().contains("\u005c"")){b=(Double)mp.get(k.image);}
                else if(k.kind==ID){d=mp.get(k.image).toString();}
                else if(k.kind==NUMBER){b=Double.parseDouble(k.image);}
                else{d=k.image;}

                if(a!=null&&b!=null&&check!=null){
                        int num = Double.compare(a,b);

                if(j.image.equals("es igual a")){{if ("" != null) return num==0&&check;}}
                else if(j.image.equals("es mayor que")){{if ("" != null) return num>0&&check;}}
                else if(j.image.equals("es menor que")){{if ("" != null) return num<0&&check;}}
                else if(j.image.equals("es igual o mayor que")){{if ("" != null) return num>=0&&check;}}
                else if(j.image.equals("es igual o menor que")){{if ("" != null) return num<=0&&check;}}
                else if(j.image.equals("no es igual a")){{if ("" != null) return num!=0&&check;}}
                }
                else if(check!=null){

                if(j.image.equals("es igual a")){{if ("" != null) return c.equals(d)&&check;}}

                }
                else if(a!=null&&b!=null){
                        int num = Double.compare(a,b);

                if(j.image.equals("es igual a")){{if ("" != null) return num==0;}}
                else if(j.image.equals("es mayor que")){{if ("" != null) return num>0;}}
                else if(j.image.equals("es menor que")){{if ("" != null) return num<0;}}
                else if(j.image.equals("es igual o mayor que")){{if ("" != null) return num>=0;}}
                else if(j.image.equals("es igual o menor que")){{if ("" != null) return num<=0;}}
                else if(j.image.equals("no es igual a")){{if ("" != null) return num!=0;}}
                }
                else {

                if(j.image.equals("es igual a")){{if ("" != null) return c.equals(d);}}

                }

                {if ("" != null) return false;}
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_3R_4()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(114)) {
    jj_scanpos = xsp;
    if (jj_scan_token(115)) {
    jj_scanpos = xsp;
    if (jj_scan_token(112)) return true;
    }
    }
    if (jj_scan_token(OP)) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(120)) return true;
    if (jj_scan_token(TYPE)) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(137)) return true;
    if (jj_3R_4()) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(RCURLYBRACE)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public PieLTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[16];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static private int[] jj_la1_4;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
      jj_la1_init_4();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x0,0x0,0x0,0x200,0x0,0x200,0x200,0x0,0x0,0x0,0x80,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x89010000,0x800000,0xd0000,0x90000,0x90000,0x0,0x0,0x0,0x0,0x0,0xd0000,0x90000,0x0,0x89010000,0xd0000,0xd0000,};
   }
   private static void jj_la1_init_4() {
      jj_la1_4 = new int[] {0x38,0x0,0x0,0x0,0x0,0x0,0x2,0x0,0x0,0x4,0x100,0x100,0x0,0x38,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[3];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public PieL(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PieL(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PieLTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public PieL(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new PieLTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public PieL(PieLTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(PieLTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[138];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 16; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
          if ((jj_la1_4[i] & (1<<j)) != 0) {
            la1tokens[128+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 138; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
