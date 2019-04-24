.class public Lo/eok;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:I

.field private k:Landroid/graphics/Bitmap;

.field private p:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->b:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->c:I

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->e:I

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->h:Z

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->i:I

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lo/eok;->g:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->f:Z

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->p:Landroid/view/View$OnClickListener;

    .line 52
    iput p1, p0, Lo/eok;->i:I

    .line 53
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->b:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->c:I

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->e:I

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->h:Z

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->i:I

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lo/eok;->g:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->f:Z

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->p:Landroid/view/View$OnClickListener;

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eok;->b:I

    .line 65
    invoke-static {p2}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    .line 66
    invoke-static {p3}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    .line 67
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eok;->e:I

    .line 68
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLandroid/graphics/Bitmap;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->b:I

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->c:I

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->e:I

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->h:Z

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lo/eok;->i:I

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lo/eok;->g:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eok;->f:Z

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eok;->p:Landroid/view/View$OnClickListener;

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eok;->b:I

    .line 57
    invoke-static {p2}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    .line 58
    invoke-static {p3}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    .line 59
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/eok;->h:Z

    .line 60
    invoke-static {p5}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lo/eok;->k:Landroid/graphics/Bitmap;

    .line 61
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/eok;->h:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/eok;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/eok;->g:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/eok;->k:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c(Z)V
    .locals 0

    .line 32
    iput-boolean p1, p0, Lo/eok;->f:Z

    .line 33
    return-void
.end method

.method public d()I
    .locals 1

    .line 44
    iget v0, p0, Lo/eok;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eok;->i:I

    .line 49
    return-void
.end method

.method public e(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 127
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnClickListener;

    iput-object v0, p0, Lo/eok;->p:Landroid/view/View$OnClickListener;

    .line 128
    return-void
.end method

.method public e()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/eok;->f:Z

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/eok;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 114
    iget v0, p0, Lo/eok;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public h()Landroid/view/View$OnClickListener;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/eok;->p:Landroid/view/View$OnClickListener;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 89
    iget v0, p0, Lo/eok;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/eok;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public o()Landroid/os/Bundle;
    .locals 3

    .line 142
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 143
    const-string v0, "ID"

    invoke-virtual {p0}, Lo/eok;->i()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 144
    const-string v0, "mContent"

    invoke-virtual {p0}, Lo/eok;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SettingMainListItem [ID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eok;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eok;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mSummary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eok;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mResIdRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eok;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mResView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eok;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
