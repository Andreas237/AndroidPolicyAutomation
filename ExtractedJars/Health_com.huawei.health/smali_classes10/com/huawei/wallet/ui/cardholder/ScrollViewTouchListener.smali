.class public Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->e(Z)V

    .line 26
    return-void
.end method

.method private e(Z)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->b(Z)V

    .line 30
    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 1

    .line 34
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->a:Z

    .line 35
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->a:Z

    if-eqz v0, :cond_0

    .line 42
    const/4 v0, 0x0

    return v0

    .line 45
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
