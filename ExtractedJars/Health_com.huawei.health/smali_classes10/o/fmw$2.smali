.class Lo/fmw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fmw;->b(Ljava/lang/String;J)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/fmw$b<Ljava/lang/Long;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/fmw;


# direct methods
.method constructor <init>(Lo/fmw;)V
    .locals 0

    .line 469
    iput-object p1, p0, Lo/fmw$2;->c:Lo/fmw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    .line 473
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 469
    invoke-virtual {p0, p1}, Lo/fmw$2;->a(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
