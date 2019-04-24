.class public Lo/cwv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const-class v0, Lo/cwv;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cwv;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const-string v0, "e8fdb5642f64a4f75c9ef453d1c3beb48a7f3fb59a2f70a08cca447420e1ed1094e05ef54c6ed4ba6d6f00147395214b92abc74fe9b922d4eccf5c9de2b91e843fba6eabfa4f98be4c3e0e6ed6ff4e001085028c6b7dd2aa100eddf1afd1015d9d59d5975680e118f2d85742c6c79f7f62dedd53e5d80da395242099a166a8e70d0dda160051adb0aae094ff2b244827262d8a4bc1224eafa642d555705a404784ced9a160cad614bbf486b38ef2bc0119fff2617daae6a03d9aa86d2086f3f9de2d5adbdf3e82a9df454780f40fc809762a6081f795c4834282cdc1a2461da5edc26459e3f4e946b5cd076e028a255d86d00702afeb08fc6e782bce2a11090d"

    iput-object v0, p0, Lo/cwv;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/security/interfaces/RSAPublicKey;
    .locals 10

    .line 62
    new-instance v4, Lo/cww;

    invoke-direct {v4, p1}, Lo/cww;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v4}, Lo/cww;->c()Ljava/lang/String;

    move-result-object v5

    .line 65
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 67
    iput-object v5, p0, Lo/cwv;->a:Ljava/lang/String;

    .line 71
    :cond_0
    :try_start_0
    new-instance v6, Ljava/math/BigInteger;

    iget-object v0, p0, Lo/cwv;->a:Ljava/lang/String;

    const/16 v1, 0x10

    invoke-direct {v6, v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 72
    new-instance v7, Ljava/math/BigInteger;

    const-string v0, "65537"

    invoke-direct {v7, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 73
    const-string v0, "RSA"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v8

    .line 74
    new-instance v9, Ljava/security/spec/RSAPublicKeySpec;

    invoke-direct {v9, v6, v7}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 75
    invoke-virtual {v8, v9}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPublicKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 76
    :catch_0
    move-exception v6

    .line 77
    sget-object v0, Lo/cwv;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return-object v0
.end method
