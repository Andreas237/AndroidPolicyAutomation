.class Lo/eii$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekr;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eii$5;->a(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/eii$5;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/eii$5;I)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/eii$5$5;->d:Lo/eii$5;

    iput p2, p0, Lo/eii$5$5;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/Long;Lo/ejp;>;)V"
        }
    .end annotation

    .line 133
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 134
    const-string v0, "err_code"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    const-string v0, "stepDayData"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const-string v0, "queryId"

    iget v1, p0, Lo/eii$5$5;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    iget-object v0, p0, Lo/eii$5$5;->d:Lo/eii$5;

    iget-object v0, v0, Lo/eii$5;->b:Lo/ekh;

    invoke-virtual {v0, v2}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 142
    return-void
.end method

.method public synthetic b(ILjava/lang/Object;)V
    .locals 1

    .line 128
    move-object v0, p2

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, p1, v0}, Lo/eii$5$5;->a(ILjava/util/Map;)V

    return-void
.end method
