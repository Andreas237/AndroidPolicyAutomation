.class public abstract Lcom/huawei/qrcode/result/ResultHandler;
.super Ljava/lang/Object;


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private final mResult:Lo/pr;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lo/pr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/qrcode/result/ResultHandler;->mResult:Lo/pr;

    iput-object p1, p0, Lcom/huawei/qrcode/result/ResultHandler;->mActivity:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public areContentsSecure()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final getActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/result/ResultHandler;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public getDisplayContents()Ljava/lang/CharSequence;
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/result/ResultHandler;->mResult:Lo/pr;

    invoke-virtual {v0}, Lo/pr;->a()Ljava/lang/String;

    move-result-object v2

    const-string v0, "\r"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getResult()Lo/pr;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/result/ResultHandler;->mResult:Lo/pr;

    return-object v0
.end method

.method public final getType()Lo/ps;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/result/ResultHandler;->mResult:Lo/pr;

    invoke-virtual {v0}, Lo/pr;->b()Lo/ps;

    move-result-object v0

    return-object v0
.end method
