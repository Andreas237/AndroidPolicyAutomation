.class public final enum Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/proxy/ProxyInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ProxyType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

.field public static final enum HTTP:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

.field public static final enum SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

.field public static final enum SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v1, "HTTP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->HTTP:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    .line 31
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v1, "SOCKS4"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    .line 32
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v1, "SOCKS5"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    .line 28
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->HTTP:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->$VALUES:[Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;
    .locals 1

    .line 28
    const-class v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;
    .locals 1

    .line 28
    sget-object v0, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->$VALUES:[Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    return-object v0
.end method
