package s.h.e.l.l;

import android.app.Application;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class N {
    static boolean la = true;

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[Catch: Throwable -> 0x0083, TryCatch #6 {Throwable -> 0x0083, blocks: (B:13:0x0019, B:15:0x001d, B:17:0x0039, B:21:0x006e, B:23:0x0074, B:25:0x007d, B:36:0x0095, B:38:0x009e, B:29:0x0085, B:31:0x008e), top: B:12:0x0019, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: Throwable -> 0x0083, TRY_ENTER, TryCatch #6 {Throwable -> 0x0083, blocks: (B:13:0x0019, B:15:0x001d, B:17:0x0039, B:21:0x006e, B:23:0x0074, B:25:0x007d, B:36:0x0095, B:38:0x009e, B:29:0x0085, B:31:0x008e), top: B:12:0x0019, inners: #8 }] */
    static {
        /*
            r1 = 0
            r0 = 1
            s.h.e.l.l.N.la = r0
            r3 = 0
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L61
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb5
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb5
            if (r0 == 0) goto L14
            r0.hashCode()     // Catch: java.lang.Exception -> Laa
        L14:
            if (r2 == 0) goto L19
            r2.hashCode()     // Catch: java.lang.Exception -> Lad
        L19:
            boolean r0 = s.h.e.l.l.N.la     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L6e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = s.h.e.l.l.S.p     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L83
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "/libexec.so"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = s.h.e.l.l.S.m     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = s.h.e.l.l.S.p     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L83
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "/libexecmain.so"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L83
        L51:
            return
        L52:
            r0 = move-exception
            r0 = r1
        L54:
            if (r0 == 0) goto L59
            r0.hashCode()     // Catch: java.lang.Exception -> La4
        L59:
            if (r1 == 0) goto L19
            r3.hashCode()     // Catch: java.lang.Exception -> L5f
            goto L19
        L5f:
            r0 = move-exception
            goto L19
        L61:
            r0 = move-exception
            r2 = r1
        L63:
            if (r2 == 0) goto L68
            r2.hashCode()     // Catch: java.lang.Exception -> La6
        L68:
            if (r1 == 0) goto L6d
            r3.hashCode()     // Catch: java.lang.Exception -> La8
        L6d:
            throw r0
        L6e:
            boolean r0 = x()     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L85
            java.lang.String r0 = "exec"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = s.h.e.l.l.S.m     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L51
            java.lang.String r0 = "execmain"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L83
            goto L51
        L83:
            r0 = move-exception
            goto L51
        L85:
            java.lang.String r0 = "exec_x86"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L94
            boolean r0 = s.h.e.l.l.S.m     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L51
            java.lang.String r0 = "execmain_x86"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L94
            goto L51
        L94:
            r0 = move-exception
            java.lang.String r0 = "exec"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = s.h.e.l.l.S.m     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L51
            java.lang.String r0 = "execmain"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L83
            goto L51
        La4:
            r0 = move-exception
            goto L59
        La6:
            r2 = move-exception
            goto L68
        La8:
            r1 = move-exception
            goto L6d
        Laa:
            r0 = move-exception
            goto L14
        Lad:
            r0 = move-exception
            goto L19
        Lb0:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L63
        Lb5:
            r2 = move-exception
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.N.<clinit>():void");
    }

    public static native ClassLoader al(ClassLoader classLoader, ApplicationInfo applicationInfo, String str, String str2);

    public static native byte[] b2b(byte[] bArr, int i);

    public static native boolean l(Application application, String str);

    public static native void m(String str, int i);

    public static native boolean r(Application application, String str);

    public static native boolean ra(Application application, String str);

    public static native void sa(String str, String str2);

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(4:5|6|(2:38|39)|(2:34|35))|9|10|11|12|13|(1:15)|16|(2:18|19)|(2:26|(1:28))|31|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: Exception -> 0x0087, TryCatch #6 {Exception -> 0x0087, blocks: (B:13:0x001c, B:15:0x002b, B:16:0x0032, B:18:0x0039), top: B:12:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #6 {Exception -> 0x0087, blocks: (B:13:0x001c, B:15:0x002b, B:16:0x0032, B:18:0x0039), top: B:12:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: Exception -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x007a, blocks: (B:10:0x0016, B:26:0x0048), top: B:9:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x() {
        /*
            r1 = 0
            r3 = 0
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L61
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8e
            if (r0 == 0) goto L11
            r0.hashCode()     // Catch: java.lang.Exception -> L83
        L11:
            if (r2 == 0) goto L16
            r2.hashCode()     // Catch: java.lang.Exception -> L85
        L16:
            java.lang.String r0 = s.h.e.l.l.S.a()     // Catch: java.lang.Exception -> L7a
            r1 = 20
            byte[] r2 = new byte[r1]     // Catch: java.lang.Exception -> L87
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = "/system/bin/linker"
            r1.<init>(r3)     // Catch: java.lang.Exception -> L87
            boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L87
            if (r3 != 0) goto L32
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = "/system/bin/linker64"
            r1.<init>(r3)     // Catch: java.lang.Exception -> L87
        L32:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L87
            r3.<init>(r1)     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto L46
            r3.read(r2)     // Catch: java.lang.Exception -> L87
            r3.close()     // Catch: java.lang.Exception -> L87
            r1 = 18
            r1 = r2[r1]     // Catch: java.lang.Exception -> L87
            switch(r1) {
                case -73: goto L77;
                case 3: goto L6e;
                case 40: goto L74;
                case 62: goto L71;
                default: goto L46;
            }
        L46:
            if (r0 == 0) goto L7b
            java.lang.String r1 = "x86"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L7b
            r0 = 1
        L51:
            return r0
        L52:
            r0 = move-exception
            r0 = r1
        L54:
            if (r0 == 0) goto L59
            r0.hashCode()     // Catch: java.lang.Exception -> L7d
        L59:
            if (r1 == 0) goto L16
            r3.hashCode()     // Catch: java.lang.Exception -> L5f
            goto L16
        L5f:
            r0 = move-exception
            goto L16
        L61:
            r0 = move-exception
            r2 = r1
        L63:
            if (r2 == 0) goto L68
            r2.hashCode()     // Catch: java.lang.Exception -> L7f
        L68:
            if (r1 == 0) goto L6d
            r3.hashCode()     // Catch: java.lang.Exception -> L81
        L6d:
            throw r0
        L6e:
            java.lang.String r0 = "x86"
            goto L46
        L71:
            java.lang.String r0 = "x86_64"
            goto L46
        L74:
            java.lang.String r0 = "armeabi"
            goto L46
        L77:
            java.lang.String r0 = "arm64-v8a"
            goto L46
        L7a:
            r0 = move-exception
        L7b:
            r0 = 0
            goto L51
        L7d:
            r0 = move-exception
            goto L59
        L7f:
            r2 = move-exception
            goto L68
        L81:
            r1 = move-exception
            goto L6d
        L83:
            r0 = move-exception
            goto L11
        L85:
            r0 = move-exception
            goto L16
        L87:
            r1 = move-exception
            goto L46
        L89:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L63
        L8e:
            r2 = move-exception
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.N.x():boolean");
    }
}
