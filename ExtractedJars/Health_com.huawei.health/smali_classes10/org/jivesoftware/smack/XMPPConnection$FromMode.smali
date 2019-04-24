.class public final enum Lorg/jivesoftware/smack/XMPPConnection$FromMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/XMPPConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FromMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/XMPPConnection$FromMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/XMPPConnection$FromMode;

.field public static final enum OMITTED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

.field public static final enum UNCHANGED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

.field public static final enum USER:Lorg/jivesoftware/smack/XMPPConnection$FromMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 454
    new-instance v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const-string v1, "UNCHANGED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/XMPPConnection$FromMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->UNCHANGED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    .line 460
    new-instance v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const-string v1, "OMITTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/XMPPConnection$FromMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->OMITTED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    .line 464
    new-instance v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const-string v1, "USER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/XMPPConnection$FromMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->USER:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    .line 450
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    sget-object v1, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->UNCHANGED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->OMITTED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->USER:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->$VALUES:[Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 450
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/XMPPConnection$FromMode;
    .locals 1

    .line 450
    const-class v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/XMPPConnection$FromMode;
    .locals 1

    .line 450
    sget-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->$VALUES:[Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/XMPPConnection$FromMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    return-object v0
.end method
