.class Lcom/huawei/openalliance/ad/views/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/f;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/f;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/f$1;->a:Lcom/huawei/openalliance/ad/views/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f$1;->a:Lcom/huawei/openalliance/ad/views/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/f;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/views/f;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "touch down skipAdButton x=%f, y=%f"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f$1;->a:Lcom/huawei/openalliance/ad/views/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/f;->a(Lcom/huawei/openalliance/ad/views/f;)Lcom/huawei/openalliance/ad/h/a/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f$1;->a:Lcom/huawei/openalliance/ad/views/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/f;->a(Lcom/huawei/openalliance/ad/views/f;)Lcom/huawei/openalliance/ad/h/a/a;

    move-result-object v0

    float-to-int v1, v5

    float-to-int v2, v6

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/h/a/a;->a(II)V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
