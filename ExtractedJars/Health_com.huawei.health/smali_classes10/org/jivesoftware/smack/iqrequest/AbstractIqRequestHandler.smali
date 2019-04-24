.class public abstract Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;


# instance fields
.field private final element:Ljava/lang/String;

.field private final mode:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;

.field private final namespace:Ljava/lang/String;

.field private final type:Lorg/jivesoftware/smack/packet/IQ$Type;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/IQ$Type;Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    sget-object v0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler$4;->b:[I

    invoke-virtual {p3}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 36
    :sswitch_0
    goto :goto_1

    .line 38
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only get and set IQ type allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 40
    :goto_1
    iput-object p1, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->element:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->namespace:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    .line 43
    iput-object p4, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->mode:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;

    .line 44
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public getElement()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->element:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;
    .locals 1

    .line 51
    iget-object v0, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->mode:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lorg/jivesoftware/smack/packet/IQ$Type;
    .locals 1

    .line 56
    iget-object v0, p0, Lorg/jivesoftware/smack/iqrequest/AbstractIqRequestHandler;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    return-object v0
.end method

.method public abstract handleIQRequest(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/packet/IQ;
.end method
