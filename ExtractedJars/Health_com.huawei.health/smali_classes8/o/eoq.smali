.class public Lo/eoq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private h:Z

.field private i:Ljava/lang/String;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lo/eoq;->e:I

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lo/eoq;->c:I

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lo/eoq;->d:I

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoq;->a:Ljava/lang/String;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoq;->b:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoq;->i:Ljava/lang/String;

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eoq;->h:Z

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoq;->g:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eoq;->k:Z

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eoq;->f:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/eoq;->i:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 82
    iput p1, p0, Lo/eoq;->d:I

    .line 83
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 122
    iput-boolean p1, p0, Lo/eoq;->f:Z

    .line 123
    return-void
.end method

.method public b()I
    .locals 1

    .line 78
    iget v0, p0, Lo/eoq;->d:I

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/eoq;->i:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public c()I
    .locals 1

    .line 50
    iget v0, p0, Lo/eoq;->e:I

    return v0
.end method

.method public c(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/eoq;->g:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 103
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/eoq;->a:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 98
    iput-boolean p1, p0, Lo/eoq;->k:Z

    .line 99
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/eoq;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 46
    iput p1, p0, Lo/eoq;->e:I

    .line 47
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/eoq;->b:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/eoq;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 114
    iput p1, p0, Lo/eoq;->c:I

    .line 115
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 90
    iput-boolean p1, p0, Lo/eoq;->h:Z

    .line 91
    return-void
.end method

.method public f()Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 106
    iget-object v0, p0, Lo/eoq;->g:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lo/eoq;->h:Z

    return v0
.end method

.method public h()I
    .locals 1

    .line 110
    iget v0, p0, Lo/eoq;->c:I

    return v0
.end method

.method public i()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lo/eoq;->k:Z

    return v0
.end method

.method public k()Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lo/eoq;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceSettingFactoryListItem [ID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoq;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoq;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mSubContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mRightText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoq;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mChecked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/eoq;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoq;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
