.class public Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Landroid/text/style/URLSpan;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mListener:Lo/bge;

.field private mUrl_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->TAG:Ljava/lang/String;

    .line 105
    new-instance v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo/bge;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mUrl_:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mListener:Lo/bge;

    .line 35
    return-void
.end method

.method private isValidScheme()Z
    .locals 4

    .line 79
    const/4 v2, 0x0

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mUrl_:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 83
    return v2

    .line 88
    :cond_0
    :try_start_0
    new-instance v3, Ljava/net/URI;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mUrl_:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 89
    const-string v0, "hwsns"

    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    const/4 v2, 0x1

    goto :goto_0

    .line 93
    :cond_1
    const-string v0, "hwid"

    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    const/4 v2, 0x1

    .line 101
    :cond_2
    :goto_0
    goto :goto_1

    .line 98
    :catch_0
    move-exception v3

    .line 100
    sget-object v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->TAG:Ljava/lang/String;

    const-string v1, "get exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :goto_1
    return v2
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->isValidScheme()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mListener:Lo/bge;

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mListener:Lo/bge;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;->mUrl_:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lo/bge;->b(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :cond_0
    invoke-super {p0, p1}, Landroid/text/style/URLSpan;->onClick(Landroid/view/View;)V

    .line 72
    :cond_1
    :goto_0
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    .line 40
    invoke-super {p0, p1}, Landroid/text/style/URLSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 43
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 44
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 45
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_button_text_nomal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 55
    :goto_0
    return-void
.end method
