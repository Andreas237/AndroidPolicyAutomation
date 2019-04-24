.class synthetic Lorg/jivesoftware/smack/packet/XMPPError$3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/XMPPError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 171
    invoke-static {}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->values()[Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/jivesoftware/smack/packet/XMPPError$3;->c:[I

    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError$3;->c:[I

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->gone:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    :goto_0
    :try_start_1
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError$3;->c:[I

    sget-object v1, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->redirect:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    return-void
.end method
