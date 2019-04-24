.class Lo/evi$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/evk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evi$1;->intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/evi$1;


# direct methods
.method constructor <init>(Lo/evi$1;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lo/evi$1$2;->e:Lo/evi$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(JJZ)V
    .locals 7

    .line 336
    iget-object v0, p0, Lo/evi$1$2;->e:Lo/evi$1;

    iget-object v0, v0, Lo/evi$1;->e:Lo/evi;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    iget-object v6, p0, Lo/evi$1$2;->e:Lo/evi$1;

    iget-object v6, v6, Lo/evi$1;->a:Lo/evl;

    invoke-static/range {v0 .. v6}, Lo/evi;->c(Lo/evi;JJZLo/evl;)V

    .line 337
    return-void
.end method
