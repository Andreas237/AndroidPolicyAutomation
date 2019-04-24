.class Lo/akx$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/akx;


# direct methods
.method private constructor <init>(Lo/akx;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lo/akx$d;->b:Lo/akx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/akx;Lo/akx$4;)V
    .locals 0

    .line 445
    invoke-direct {p0, p1}, Lo/akx$d;-><init>(Lo/akx;)V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 449
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InsertCallBack errorCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " obj"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    iget-object v0, p0, Lo/akx$d;->b:Lo/akx;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/akx;->a(Lo/akx;Z)Z

    .line 451
    return-void
.end method
