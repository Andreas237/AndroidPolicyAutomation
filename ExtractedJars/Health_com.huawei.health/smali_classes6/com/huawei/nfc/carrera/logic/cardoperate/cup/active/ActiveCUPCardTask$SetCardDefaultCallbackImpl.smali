.class Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask$SetCardDefaultCallbackImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SetCardDefaultCallbackImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setResultCallback(I)V
    .locals 1

    .line 334
    const-string v0, "ActiveCUPCardTask, set default card success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 335
    return-void
.end method
