.class public Lo/eih$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "l"
.end annotation


# instance fields
.field final synthetic d:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 0

    .line 837
    iput-object p1, p0, Lo/eih$l;->d:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FLo/lh;)Ljava/lang/String;
    .locals 1

    .line 845
    invoke-virtual {p0, p1, p2}, Lo/eih$l;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FF)Ljava/lang/String;
    .locals 7

    .line 856
    iget-object v0, p0, Lo/eih$l;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    float-to-long v1, p1

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    float-to-long v3, p2

    const-wide/16 v5, 0x3c

    mul-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    const v5, 0x20024

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FLo/lh;)Ljava/lang/String;
    .locals 7

    .line 849
    float-to-int v5, p1

    .line 850
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 851
    new-instance v0, Ljava/util/Date;

    int-to-long v1, v5

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 841
    return-void
.end method
