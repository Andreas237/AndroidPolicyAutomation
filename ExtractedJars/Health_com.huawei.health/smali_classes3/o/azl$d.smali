.class Lo/azl$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/azl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Lo/azd$c;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/azd;>;"
        }
    .end annotation
.end field

.field private d:Lo/azd$a;


# direct methods
.method constructor <init>(Lo/azd$c;Lo/azd$a;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/azd$c;Lo/azd$a;Ljava/util/Set<Lo/azd;>;)V"
        }
    .end annotation

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    iput-object p1, p0, Lo/azl$d;->b:Lo/azd$c;

    .line 234
    iput-object p2, p0, Lo/azl$d;->d:Lo/azd$a;

    .line 235
    iput-object p3, p0, Lo/azl$d;->c:Ljava/util/Set;

    .line 236
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 241
    const-string v0, "SNSIMCenterHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notify App listener IMStatus change,imStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/azl$d;->b:Lo/azd$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",loginCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/azl$d;->d:Lo/azd$a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Lo/azl$d;->c:Ljava/util/Set;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/azl$d;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 244
    iget-object v0, p0, Lo/azl$d;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/azd;

    .line 246
    if-eqz v4, :cond_0

    .line 248
    iget-object v0, p0, Lo/azl$d;->b:Lo/azd$c;

    iget-object v1, p0, Lo/azl$d;->d:Lo/azd$a;

    invoke-interface {v4, v0, v1}, Lo/azd;->c(Lo/azd$c;Lo/azd$a;)V

    .line 250
    :cond_0
    goto :goto_0

    .line 252
    :cond_1
    return-void
.end method
