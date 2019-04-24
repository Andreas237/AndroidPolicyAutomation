.class Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$3;->c:Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 144
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 145
    iget v0, p1, Landroid/os/Message;->what:I

    nop

    .line 149
    return-void
.end method
