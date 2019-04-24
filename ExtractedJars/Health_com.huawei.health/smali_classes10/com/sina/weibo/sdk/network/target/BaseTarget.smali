.class public abstract Lcom/sina/weibo/sdk/network/target/BaseTarget;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/network/target/Target;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Ljava/lang/Object;Lcom/sina/weibo/sdk/network/target/Target<TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 0

    .line 21
    return-void
.end method

.method public onRequestDone()V
    .locals 0

    .line 11
    return-void
.end method

.method public onRequestSuccessBg(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 16
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 26
    return-void
.end method

.method public onStartBg()V
    .locals 0

    .line 31
    return-void
.end method
