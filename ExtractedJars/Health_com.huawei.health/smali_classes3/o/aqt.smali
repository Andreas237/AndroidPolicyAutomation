.class public Lo/aqt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lo/aqt;->d:I

    .line 52
    const/4 v0, -0x1

    iput v0, p0, Lo/aqt;->c:I

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aqt;->a:Z

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aqt;->g:Z

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aqt;->f:Z

    .line 106
    iput-object p1, p0, Lo/aqt;->e:Ljava/lang/String;

    .line 107
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 2

    .line 197
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "voice"

    invoke-virtual {v0, p1, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aqt;->b:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lo/aqt;->b:Ljava/lang/String;

    .line 187
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 323
    if-eqz p1, :cond_0

    .line 325
    instance-of v0, p1, Lo/aqt;

    if-eqz v0, :cond_0

    .line 327
    move-object v2, p1

    check-cast v2, Lo/aqt;

    .line 328
    iget-object v0, v2, Lo/aqt;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, v2, Lo/aqt;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/aqt;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    const/4 v0, 0x1

    return v0

    .line 334
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 340
    iget-object v0, p0, Lo/aqt;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 342
    iget-object v0, p0, Lo/aqt;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    .line 346
    :cond_0
    const/4 v0, -0x1

    return v0
.end method
