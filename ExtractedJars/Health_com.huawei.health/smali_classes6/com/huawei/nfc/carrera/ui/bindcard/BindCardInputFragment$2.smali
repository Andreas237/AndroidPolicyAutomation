.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 353
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "================runnable \u65f6\u95f4\u5230\u505c\u6b62\u5b9a\u4f4d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V

    .line 355
    return-void
.end method
