.class Lo/dwo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwo;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:Lo/dwo;


# direct methods
.method constructor <init>(Lo/dwo;IJ)V
    .locals 0

    .line 1055
    iput-object p1, p0, Lo/dwo$5;->d:Lo/dwo;

    iput p2, p0, Lo/dwo$5;->c:I

    iput-wide p3, p0, Lo/dwo$5;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1057
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 1058
    const/4 v5, 0x0

    .line 1059
    instance-of v0, v4, Lo/dwm;

    if-eqz v0, :cond_0

    .line 1060
    move-object v5, v4

    check-cast v5, Lo/dwm;

    .line 1062
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 1063
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "singleDayRecord is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1064
    return-void

    .line 1066
    :cond_1
    const/4 v6, 0x0

    .line 1067
    iget v0, p0, Lo/dwo$5;->c:I

    invoke-static {v0}, Lo/dxc;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1068
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x3

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/lit8 v6, v0, 0x0

    .line 1069
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x4

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1070
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x5

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1071
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x6

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1072
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x7

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1073
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/16 v3, 0x8

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1074
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/16 v3, 0x9

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    goto :goto_0

    .line 1075
    :cond_2
    iget v0, p0, Lo/dwo$5;->c:I

    invoke-static {v0}, Lo/dxc;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1076
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/4 v3, 0x1

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/lit8 v6, v0, 0x0

    goto :goto_0

    .line 1077
    :cond_3
    iget v0, p0, Lo/dwo$5;->c:I

    invoke-static {v0}, Lo/dxc;->c(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1078
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/16 v3, 0xa

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/lit8 v6, v0, 0x0

    .line 1079
    iget-object v0, p0, Lo/dwo$5;->d:Lo/dwo;

    iget-wide v1, p0, Lo/dwo$5;->b:J

    const/16 v3, 0xb

    invoke-static {v0, v5, v3, v1, v2}, Lo/dwo;->e(Lo/dwo;Lo/dwm;IJ)I

    move-result v0

    add-int/2addr v6, v0

    .line 1081
    :cond_4
    :goto_0
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1082
    if-lez v6, :cond_5

    .line 1083
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/dwm;->b(Z)V

    .line 1084
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    .line 1086
    :cond_5
    return-void
.end method
