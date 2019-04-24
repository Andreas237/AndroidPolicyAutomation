.class public Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;
.super Ljava/lang/Exception;
.source "UnsuccessfulResponseException.java"


# instance fields
.field private final code:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsuccessful response code received from stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 9
    iput p1, p0, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;->code:I

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;->code:I

    return v0
.end method
