.class public Lo/bnl;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private c:Landroid/app/Activity;

.field private d:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method

.method private c()V
    .locals 3

    .line 84
    iget-object v0, p0, Lo/bnl;->c:Landroid/app/Activity;

    iget-wide v1, p0, Lo/bnl;->d:J

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(Landroid/app/Activity;J)V

    .line 85
    return-void
.end method


# virtual methods
.method public setActivated(Z)V
    .locals 1

    .line 68
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setActivated(Z)V

    .line 69
    if-eqz p1, :cond_0

    .line 71
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p0, v0}, Lo/bnl;->setAlpha(F)V

    goto :goto_0

    .line 75
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bnl;->setAlpha(F)V

    .line 77
    :goto_0
    return-void
.end method

.method public setContext(Landroid/app/Activity;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/bnl;->c:Landroid/app/Activity;

    .line 40
    return-void
.end method

.method public setPressed(Z)V
    .locals 4

    .line 50
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setPressed(Z)V

    .line 51
    if-eqz p1, :cond_0

    .line 53
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p0, v0}, Lo/bnl;->setAlpha(F)V

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Lo/bnl;->getAlpha()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 59
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bnl;->setAlpha(F)V

    .line 60
    invoke-direct {p0}, Lo/bnl;->c()V

    .line 63
    :cond_1
    :goto_0
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lo/bnl;->d:J

    .line 45
    return-void
.end method
