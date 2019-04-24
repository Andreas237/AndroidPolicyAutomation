.class public Lo/cfx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;


# instance fields
.field private a:I

.field private c:Landroid/support/v4/app/Fragment;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(IIILandroid/support/v4/app/Fragment;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, -0x1

    iput v0, p0, Lo/cfx;->a:I

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lo/cfx;->d:I

    .line 10
    const/4 v0, -0x1

    iput v0, p0, Lo/cfx;->e:I

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfx;->c:Landroid/support/v4/app/Fragment;

    .line 15
    iput p1, p0, Lo/cfx;->a:I

    .line 16
    iput p2, p0, Lo/cfx;->d:I

    .line 17
    iput p3, p0, Lo/cfx;->e:I

    .line 18
    iput-object p4, p0, Lo/cfx;->c:Landroid/support/v4/app/Fragment;

    .line 19
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 26
    iget v0, p0, Lo/cfx;->d:I

    return v0
.end method

.method public b()Landroid/support/v4/app/Fragment;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/cfx;->c:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 30
    iget v0, p0, Lo/cfx;->e:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 22
    iget v0, p0, Lo/cfx;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TabFragmentInterfaceModel [mTabViewId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfx;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mTabTextViewId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfx;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mTabNameStringId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfx;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cfx;->c:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
