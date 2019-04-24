.class Lo/czy$b$b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/czy$b$b;

.field private c:F

.field private e:I


# direct methods
.method public constructor <init>(Lo/czy$b$b;F)V
    .locals 1

    .line 416
    iput-object p1, p0, Lo/czy$b$b$d;->a:Lo/czy$b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 413
    const/4 v0, 0x0

    iput v0, p0, Lo/czy$b$b$d;->c:F

    .line 414
    const/4 v0, 0x0

    iput v0, p0, Lo/czy$b$b$d;->e:I

    .line 417
    iput p2, p0, Lo/czy$b$b$d;->c:F

    .line 418
    return-void
.end method


# virtual methods
.method public d()F
    .locals 2

    .line 426
    iget v0, p0, Lo/czy$b$b$d;->e:I

    if-nez v0, :cond_0

    .line 427
    const/4 v0, 0x0

    return v0

    .line 429
    :cond_0
    iget v0, p0, Lo/czy$b$b$d;->c:F

    iget v1, p0, Lo/czy$b$b$d;->e:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public d(F)V
    .locals 2

    .line 421
    iget v0, p0, Lo/czy$b$b$d;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/czy$b$b$d;->e:I

    .line 422
    iget v0, p0, Lo/czy$b$b$d;->c:F

    add-float/2addr v0, p1

    iput v0, p0, Lo/czy$b$b$d;->c:F

    .line 423
    return-void
.end method
