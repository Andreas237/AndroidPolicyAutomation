.class Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showReadCardAnimation()V
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

    .line 222
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V

    .line 242
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 235
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 228
    return-void
.end method
