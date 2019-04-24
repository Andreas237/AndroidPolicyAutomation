.class Lo/bnh$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bnh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field public final b:Z

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ZLjava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/util/List<Ljava/lang/Object;>;Ljava/util/List<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-boolean p1, p0, Lo/bnh$c;->b:Z

    .line 26
    iput-object p2, p0, Lo/bnh$c;->d:Ljava/util/List;

    .line 27
    iput-object p3, p0, Lo/bnh$c;->a:Ljava/util/List;

    .line 28
    return-void
.end method

.method public static a()Lo/bnh$c;
    .locals 4

    .line 31
    new-instance v0, Lo/bnh$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/bnh$c;-><init>(ZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static d(Ljava/util/List;Ljava/util/List;)Lo/bnh$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Object;>;Ljava/util/List<Ljava/lang/Object;>;)Lo/bnh$c;"
        }
    .end annotation

    .line 35
    new-instance v0, Lo/bnh$c;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lo/bnh$c;-><init>(ZLjava/util/List;Ljava/util/List;)V

    return-object v0
.end method
