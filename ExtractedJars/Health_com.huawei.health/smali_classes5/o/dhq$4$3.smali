.class Lo/dhq$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dhq$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/function/BiConsumer<Ljava/lang/String;Lo/dhq$a;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/dhq$4;


# direct methods
.method constructor <init>(Lo/dhq$4;)V
    .locals 0

    .line 621
    iput-object p1, p0, Lo/dhq$4$3;->a:Lo/dhq$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 621
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    check-cast v1, Lo/dhq$a;

    invoke-virtual {p0, v0, v1}, Lo/dhq$4$3;->b(Ljava/lang/String;Lo/dhq$a;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lo/dhq$a;)V
    .locals 6

    .line 624
    const-wide/16 v4, 0x0

    .line 625
    if-eqz p2, :cond_0

    .line 626
    invoke-virtual {p2}, Lo/dhq$a;->a()J

    move-result-wide v4

    .line 628
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocationsCallbackMapList key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", and time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    return-void
.end method
