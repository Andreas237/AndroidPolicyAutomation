.class final Lo/rj$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/rj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lo/ou;

.field private final d:I

.field private final e:Lo/ou;


# direct methods
.method private constructor <init>(Lo/ou;Lo/ou;I)V
    .locals 0

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 406
    iput-object p1, p0, Lo/rj$a;->e:Lo/ou;

    .line 407
    iput-object p2, p0, Lo/rj$a;->a:Lo/ou;

    .line 408
    iput p3, p0, Lo/rj$a;->d:I

    .line 409
    return-void
.end method

.method synthetic constructor <init>(Lo/ou;Lo/ou;ILo/rj$3;)V
    .locals 0

    .line 399
    invoke-direct {p0, p1, p2, p3}, Lo/rj$a;-><init>(Lo/ou;Lo/ou;I)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 420
    iget v0, p0, Lo/rj$a;->d:I

    return v0
.end method

.method b()Lo/ou;
    .locals 1

    .line 416
    iget-object v0, p0, Lo/rj$a;->a:Lo/ou;

    return-object v0
.end method

.method d()Lo/ou;
    .locals 1

    .line 412
    iget-object v0, p0, Lo/rj$a;->e:Lo/ou;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 425
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/rj$a;->e:Lo/ou;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/rj$a;->a:Lo/ou;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/rj$a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
