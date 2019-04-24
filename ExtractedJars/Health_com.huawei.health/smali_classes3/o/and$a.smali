.class Lo/and$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/and;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:Lo/ald;

.field private d:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/and$5;)V
    .locals 0

    .line 234
    invoke-direct {p0}, Lo/and$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(JIIII)V
    .locals 1

    .line 240
    iput-wide p1, p0, Lo/and$a;->d:J

    .line 241
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    if-nez v0, :cond_0

    .line 242
    new-instance v0, Lo/ald;

    invoke-direct {v0}, Lo/ald;-><init>()V

    iput-object v0, p0, Lo/and$a;->b:Lo/ald;

    .line 244
    :cond_0
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    iput p3, v0, Lo/ald;->a:I

    .line 245
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    iput p4, v0, Lo/ald;->d:I

    .line 246
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    iput p5, v0, Lo/ald;->e:I

    .line 247
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    iput p6, v0, Lo/ald;->b:I

    .line 248
    return-void
.end method

.method public e(JLo/ald;)Z
    .locals 4

    .line 254
    iget-wide v0, p0, Lo/and$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    if-nez v0, :cond_1

    .line 255
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 258
    :cond_1
    iget-wide v0, p0, Lo/and$a;->d:J

    invoke-static {v0, v1, p1, p2}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 259
    const/4 v0, 0x1

    return v0

    .line 262
    :cond_2
    iget-object v0, p0, Lo/and$a;->b:Lo/ald;

    invoke-virtual {v0, p3}, Lo/ald;->e(Lo/ald;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 263
    const/4 v0, 0x1

    return v0

    .line 266
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
