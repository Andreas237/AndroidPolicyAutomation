.class Lo/dwu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwu;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dwu;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/dwu;I)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/dwu$2;->a:Lo/dwu;

    iput p2, p0, Lo/dwu$2;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 209
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 210
    invoke-static {}, Lo/dwu;->a()Lo/dwr;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 211
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    instance-of v0, v3, Lo/dvj;

    if-eqz v0, :cond_0

    .line 212
    move-object v4, v3

    check-cast v4, Lo/dvj;

    .line 213
    iget-object v0, p0, Lo/dwu$2;->a:Lo/dwu;

    iget v1, p0, Lo/dwu$2;->d:I

    invoke-virtual {v0, v1, v4}, Lo/dwu;->d(ILo/dvj;)V

    .line 214
    goto :goto_0

    .line 215
    :cond_0
    new-instance v4, Lo/dvj;

    invoke-direct {v4}, Lo/dvj;-><init>()V

    .line 216
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/dvj;->c(I)V

    .line 217
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dvj;->b(I)V

    .line 218
    const-wide/16 v0, 0x0

    invoke-virtual {v4, v0, v1}, Lo/dvj;->b(D)V

    .line 219
    iget-object v0, p0, Lo/dwu$2;->a:Lo/dwu;

    iget v1, p0, Lo/dwu$2;->d:I

    invoke-virtual {v0, v1, v4}, Lo/dwu;->d(ILo/dvj;)V

    .line 221
    :goto_0
    return-void
.end method
