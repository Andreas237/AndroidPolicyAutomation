.class public abstract Lo/dok;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dok;->b:Landroid/content/Context;

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->c:Z

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->a:Z

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->e:Z

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->d:Z

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->f:Z

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->k:Z

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->g:Z

    return-void
.end method

.method private l()V
    .locals 5

    .line 97
    iget-boolean v0, p0, Lo/dok;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/dok;->a:Z

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 98
    :goto_0
    if-nez v4, :cond_1

    .line 99
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginConsistency is false,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_1
    invoke-direct {p0}, Lo/dok;->o()V

    .line 103
    return-void
.end method

.method private m()V
    .locals 2

    .line 147
    invoke-virtual {p0}, Lo/dok;->c()V

    .line 148
    iget-object v0, p0, Lo/dok;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dou;->b(Landroid/content/Context;I)V

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->g:Z

    .line 150
    return-void
.end method

.method private o()V
    .locals 4

    .line 106
    iget-boolean v0, p0, Lo/dok;->g:Z

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {p0}, Lo/dok;->e()V

    .line 108
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 111
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p0}, Lo/dok;->a()V

    .line 113
    iget-object v0, p0, Lo/dok;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dou;->b(Landroid/content/Context;I)V

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->g:Z

    .line 115
    return-void
.end method

.method private p()V
    .locals 5

    .line 138
    iget-boolean v0, p0, Lo/dok;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/dok;->d:Z

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 139
    :goto_0
    if-nez v4, :cond_1

    .line 140
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logoutConsistency is false,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void

    .line 143
    :cond_1
    invoke-direct {p0}, Lo/dok;->m()V

    .line 144
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public b()V
    .locals 5

    .line 35
    iget-object v0, p0, Lo/dok;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dou;->e(Landroid/content/Context;I)I

    move-result v4

    .line 36
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 39
    :sswitch_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadScenceIfExist:AllowLogin_Logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-virtual {p0}, Lo/dok;->k()V

    .line 41
    invoke-direct {p0}, Lo/dok;->o()V

    .line 43
    goto :goto_1

    .line 46
    :sswitch_1
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadScenceIfExist:NAllowLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p0}, Lo/dok;->f()V

    .line 49
    goto :goto_1

    .line 52
    :goto_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadScenceIfExist:UNSETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/dok;->b:Landroid/content/Context;

    .line 32
    return-void
.end method

.method protected abstract c()V
.end method

.method protected abstract d()V
.end method

.method protected abstract e()V
.end method

.method public f()V
    .locals 4

    .line 64
    iget-boolean v0, p0, Lo/dok;->k:Z

    if-eqz v0, :cond_0

    .line 65
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already onRecognizeNAllow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 68
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNAllowArea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dok;->c:Z

    .line 70
    iget-object v0, p0, Lo/dok;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dou;->b(Landroid/content/Context;I)V

    .line 71
    invoke-virtual {p0}, Lo/dok;->d()V

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->k:Z

    .line 73
    return-void
.end method

.method public g()V
    .locals 4

    .line 77
    iget-boolean v0, p0, Lo/dok;->c:Z

    if-nez v0, :cond_0

    .line 78
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not allowArea,dont login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void

    .line 81
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already loginAcount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->a:Z

    .line 83
    invoke-direct {p0}, Lo/dok;->l()V

    .line 84
    return-void
.end method

.method public h()V
    .locals 4

    .line 118
    iget-boolean v0, p0, Lo/dok;->c:Z

    if-nez v0, :cond_0

    .line 119
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not allowArea,dont logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void

    .line 122
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logoutAcount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->d:Z

    .line 124
    invoke-direct {p0}, Lo/dok;->p()V

    .line 125
    return-void
.end method

.method public i()V
    .locals 4

    .line 87
    iget-boolean v0, p0, Lo/dok;->c:Z

    if-nez v0, :cond_0

    .line 88
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not allowArea,dont login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void

    .line 91
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already loginStorage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->e:Z

    .line 93
    invoke-direct {p0}, Lo/dok;->l()V

    .line 94
    return-void
.end method

.method public k()V
    .locals 4

    .line 59
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAllowArea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->c:Z

    .line 61
    return-void
.end method

.method public n()V
    .locals 4

    .line 128
    iget-boolean v0, p0, Lo/dok;->c:Z

    if-nez v0, :cond_0

    .line 129
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not allowArea,dont logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_0
    const-string v0, "EventBus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logoutStorage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dok;->f:Z

    .line 134
    invoke-direct {p0}, Lo/dok;->p()V

    .line 135
    return-void
.end method
