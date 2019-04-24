.class public Lo/adw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Object;

.field private d:I

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lo/adw;->d:I

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adw;->e:[B

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adw;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/adw;->a:Ljava/lang/Object;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a([B)V
    .locals 1

    .line 145
    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    iput-object v0, p0, Lo/adw;->e:[B

    .line 146
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 153
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/adw;->a:Ljava/lang/Object;

    .line 154
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/adw;->d:I

    .line 138
    return-void
.end method

.method public d()[B
    .locals 1

    .line 141
    iget-object v0, p0, Lo/adw;->e:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/adw;->e:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 133
    iget v0, p0, Lo/adw;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
