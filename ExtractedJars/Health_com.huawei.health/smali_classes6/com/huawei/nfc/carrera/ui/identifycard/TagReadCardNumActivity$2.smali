.class Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showReadCardAnimationBack()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->access$100(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V

    .line 300
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 293
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 286
    return-void
.end method
