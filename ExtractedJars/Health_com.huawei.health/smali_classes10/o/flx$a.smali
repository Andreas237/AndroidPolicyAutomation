.class Lo/flx$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fpf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/flx;

.field private final e:Lo/flq;


# direct methods
.method public constructor <init>(Lo/flx;Lo/flq;)V
    .locals 2

    .line 934
    iput-object p1, p0, Lo/flx$a;->d:Lo/flx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 935
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 936
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "message must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 938
    :cond_0
    iput-object p2, p0, Lo/flx$a;->e:Lo/flq;

    .line 939
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 948
    iget-object v0, p0, Lo/flx$a;->e:Lo/flq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/flq;->d(Z)V

    .line 949
    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    .line 953
    iget-object v0, p0, Lo/flx$a;->e:Lo/flq;

    invoke-virtual {v0, p1}, Lo/flq;->d(Ljava/lang/Throwable;)V

    .line 954
    return-void
.end method

.method public b(Lo/fow;)V
    .locals 0

    .line 944
    return-void
.end method
