.class public Lcom/huawei/health/MainActivity$h;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/health/MainActivity;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/MainActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/MainActivity;Landroid/os/Looper;Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1721
    iput-object p1, p0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1722
    invoke-direct {p0, p2, p3}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 1723
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/health/MainActivity;Landroid/os/Message;)V
    .locals 18

    .line 1739
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1740
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull obj == null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1741
    return-void

    .line 1743
    :cond_0
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1745
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x7f020000

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1746
    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f020097

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1747
    invoke-static {v3}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f020201

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 1745
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ale;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1749
    goto/16 :goto_1

    .line 1752
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->q(Lcom/huawei/health/MainActivity;)V

    .line 1753
    goto/16 :goto_1

    .line 1755
    :sswitch_2
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_START_APP_FIRST_STEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->r(Lcom/huawei/health/MainActivity;)V

    .line 1758
    goto/16 :goto_1

    .line 1760
    :sswitch_3
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_START_APP_SECOND_STEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1761
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->z(Lcom/huawei/health/MainActivity;)V

    .line 1762
    goto/16 :goto_1

    .line 1764
    :sswitch_4
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_START_APP_THIRD_STEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1765
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->x(Lcom/huawei/health/MainActivity;)V

    .line 1766
    goto/16 :goto_1

    .line 1768
    :sswitch_5
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_CHECK_LANGUAGE_UPDATE_STATUS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1769
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->k()V

    .line 1770
    goto/16 :goto_1

    .line 1772
    :sswitch_6
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_NEED_START_MAINACTIVITY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1773
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->y(Lcom/huawei/health/MainActivity;)V

    .line 1774
    goto/16 :goto_1

    .line 1778
    :sswitch_7
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recive msg MSG_SHOW_PRIVACY_DLG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1780
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->v(Lcom/huawei/health/MainActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1781
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "privacy has showed, drop it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1782
    return-void

    .line 1785
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_privacy_dlg"

    const-string v3, "must"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1790
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1791
    new-instance v0, Lo/cbm$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cbm$d;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbm$d;->e(Z)Lo/cbm$d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbm$d;->d(Lo/ale;)Lo/cbm;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbm;->show()V

    goto/16 :goto_1

    .line 1793
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ale;->a(Z)V

    .line 1795
    goto/16 :goto_1

    .line 1797
    :sswitch_8
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handle_checkDataStatus_and_show_1 : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v2}, Lcom/huawei/health/MainActivity;->w(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1798
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message MSG_UPDATE_VIEW and ready to homeFragment"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1799
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->D(Lcom/huawei/health/MainActivity;)V

    .line 1800
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->w(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1801
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v5

    .line 1802
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->w(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 1803
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->d(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1806
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->j(Lcom/huawei/health/MainActivity;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1808
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->j(Lcom/huawei/health/MainActivity;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "max_report_no"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1809
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->j(Lcom/huawei/health/MainActivity;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "min_report_no"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 1810
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->j(Lcom/huawei/health/MainActivity;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "report_stype"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 1811
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleDetailUri==>max-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":min-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":reportType-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1813
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v6, v5, v7}, Lo/dth;->d(Landroid/content/Context;III)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1816
    goto :goto_0

    .line 1814
    :catch_0
    move-exception v5

    .line 1815
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    :cond_4
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->A(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v0, "1"

    invoke-static {}, Lcom/huawei/health/MainActivity;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1820
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1821
    invoke-static/range {p1 .. p1}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v5

    .line 1822
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->A(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 1823
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->a(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1827
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->B(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v0, "1"

    invoke-static {}, Lcom/huawei/health/MainActivity;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1828
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1830
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to group"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1831
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 1832
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    const-class v1, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1833
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1834
    const-string v0, "QRCode_errContent"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->B(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1835
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1836
    const-string v0, "is_form_scheme"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1837
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/health/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1838
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1842
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->C(Lcom/huawei/health/MainActivity;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 1843
    const-string v0, "show_plan"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->C(Lcom/huawei/health/MainActivity;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "extra_action"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1844
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->p()V

    .line 1848
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->F(Lcom/huawei/health/MainActivity;)V

    .line 1851
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->E(Lcom/huawei/health/MainActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    const-string v0, "1"

    invoke-static {}, Lcom/huawei/health/MainActivity;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1852
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->G(Lcom/huawei/health/MainActivity;)V

    goto/16 :goto_1

    .line 1856
    :sswitch_9
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handle_checkDataStatus_and_show_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1859
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->C()V

    .line 1860
    goto/16 :goto_1

    .line 1862
    :sswitch_a
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/content/Intent;

    .line 1863
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/ale;->b(Landroid/content/Intent;)V

    .line 1864
    goto/16 :goto_1

    .line 1870
    :sswitch_b
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: MSG_DATA_SYNC_AFTER_MIGRAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1871
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->t()V

    .line 1872
    goto/16 :goto_1

    .line 1874
    :sswitch_c
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->g()V

    .line 1875
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->I(Lcom/huawei/health/MainActivity;)Lo/elw;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/elw;->setVisibility(I)V

    .line 1876
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->s(Lcom/huawei/health/MainActivity;)Lo/abc;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/abc;->setVisibility(I)V

    .line 1877
    goto/16 :goto_1

    .line 1879
    :sswitch_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1881
    invoke-static {}, Lcom/huawei/health/MainActivity;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    const-string v0, ""

    invoke-static {}, Lcom/huawei/health/MainActivity;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1882
    :cond_8
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MESSAGE_ID_GETQRCODETICKET get unvalid userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1883
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1884
    return-void

    .line 1886
    :cond_9
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1887
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_ID_GETQRCODETICKET userid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/health/MainActivity;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1888
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$h$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v6}, Lcom/huawei/health/MainActivity$h$1;-><init>(Lcom/huawei/health/MainActivity$h;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1913
    goto/16 :goto_1

    .line 1915
    :sswitch_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1916
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020370

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1917
    goto/16 :goto_1

    .line 1919
    :sswitch_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1920
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020338

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1921
    goto/16 :goto_1

    .line 1923
    :sswitch_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->s()V

    .line 1924
    goto/16 :goto_1

    .line 1926
    :sswitch_11
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ale;->a(I)V

    .line 1927
    goto/16 :goto_1

    .line 1929
    :sswitch_12
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ale;->a(I)V

    .line 1930
    goto/16 :goto_1

    .line 1932
    :sswitch_13
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0201d2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1933
    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0200e5

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1934
    invoke-static {v3}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f02046d

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 1932
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ale;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1937
    goto/16 :goto_1

    .line 1939
    :sswitch_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1940
    goto/16 :goto_1

    .line 1942
    :sswitch_15
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0200d0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1943
    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0200c5

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1944
    invoke-static {v3}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f02046d

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 1942
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ale;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1946
    goto/16 :goto_1

    .line 1948
    :sswitch_16
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0200d0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1949
    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0200e0

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1950
    invoke-static {v3}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f02046d

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 1948
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ale;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1952
    goto/16 :goto_1

    .line 1954
    :sswitch_17
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p2

    iget v1, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lo/ale;->i(I)V

    .line 1955
    goto/16 :goto_1

    .line 1957
    :sswitch_18
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->o()V

    .line 1958
    goto/16 :goto_1

    .line 1960
    :sswitch_19
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ale;->b(I)V

    .line 1961
    goto/16 :goto_1

    .line 1963
    :sswitch_1a
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ale;->b(I)V

    .line 1964
    goto/16 :goto_1

    .line 1966
    :sswitch_1b
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ale;->d(I)V

    .line 1967
    goto/16 :goto_1

    .line 1969
    :sswitch_1c
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ale;->d(I)V

    .line 1970
    goto/16 :goto_1

    .line 1972
    :sswitch_1d
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->q()V

    .line 1973
    goto/16 :goto_1

    .line 1975
    :sswitch_1e
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0200d0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1976
    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0200e4

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    .line 1977
    invoke-static {v3}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f02046d

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 1975
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ale;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1979
    goto/16 :goto_1

    .line 1981
    :sswitch_1f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_c

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 1982
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    invoke-virtual {v0}, Lo/alh;->c()V

    goto/16 :goto_1

    .line 1986
    :sswitch_20
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivit_showGenderDialog_handle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1987
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->L()V

    .line 1988
    goto/16 :goto_1

    .line 1990
    :sswitch_21
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->N()V

    .line 1991
    goto/16 :goto_1

    .line 1993
    :sswitch_22
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->o(Lcom/huawei/health/MainActivity;)Lo/alj;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, p2

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lo/alj$d;

    invoke-virtual {v0, v1, v2}, Lo/alj;->c(Landroid/content/Context;Lo/alj$d;)V

    .line 1994
    goto/16 :goto_1

    .line 1996
    :sswitch_23
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivit_MSG_DISMISS_ADS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1997
    invoke-static/range {p1 .. p1}, Lcom/huawei/health/MainActivity;->o(Lcom/huawei/health/MainActivity;)Lo/alj;

    move-result-object v0

    invoke-virtual {v0}, Lo/alj;->d()V

    .line 1998
    goto/16 :goto_1

    .line 2000
    :sswitch_24
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->H(Lcom/huawei/health/MainActivity;)V

    .line 2001
    goto/16 :goto_1

    .line 2003
    :sswitch_25
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    move-object/from16 v1, p2

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;Ljava/lang/Object;)V

    .line 2004
    goto/16 :goto_1

    .line 2006
    :sswitch_26
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter_MSG_OBTAIN_TOKEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2007
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v7

    .line 2008
    const-string v0, "token"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2009
    const-string v0, "agrUrl"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2011
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_first_agr_sign"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 2013
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 2014
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0, v1, v9, v8}, Lcom/huawei/health/MainActivity;->e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    .line 2015
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_first_agr_sign"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_1

    .line 2018
    :cond_a
    const-string v0, "0"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    iget-object v1, v1, Lcom/huawei/health/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2019
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0, v9, v8}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 2021
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v9, v8}, Lcom/huawei/health/MainActivity;->c(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    .line 2024
    goto/16 :goto_1

    .line 2026
    :sswitch_27
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v11

    .line 2027
    const-string v0, "token"

    invoke-virtual {v11, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 2028
    const-string v0, "result"

    invoke-virtual {v11, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 2029
    const-string v0, "agrUrl"

    invoke-virtual {v11, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 2030
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v14, v13, v12}, Lcom/huawei/health/MainActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2031
    goto/16 :goto_1

    .line 2033
    :sswitch_28
    invoke-virtual/range {p2 .. p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v15

    .line 2034
    const-string v0, "token"

    invoke-virtual {v15, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 2035
    const-string v0, "agrUrl"

    invoke-virtual {v15, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 2036
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v17

    move-object/from16 v2, v16

    invoke-static {v0, v1, v2}, Lcom/huawei/health/MainActivity;->c(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    .line 2037
    goto/16 :goto_1

    .line 2040
    :sswitch_29
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->J()V

    .line 2041
    goto/16 :goto_1

    .line 2044
    :sswitch_2a
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter REQ_TRIGGER_ACCOUNT_LOGIN()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2045
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->K(Lcom/huawei/health/MainActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->K(Lcom/huawei/health/MainActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_c

    .line 2046
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->K(Lcom/huawei/health/MainActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$h$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/health/MainActivity$h$2;-><init>(Lcom/huawei/health/MainActivity$h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 2055
    :sswitch_2b
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter REQ_TRIGGER_HMS_PUSH_UPDATE_ALERT()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2056
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->k(Lcom/huawei/health/MainActivity;)V

    .line 2057
    goto/16 :goto_1

    .line 2059
    :sswitch_2c
    const-string v0, "Login_MainActivity"

    const-string v1, "Receive ConstantValues.MSG_HANDLE_MIGRATE_DATA"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2060
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 2061
    const-string v0, "Login_MainActivity"

    const-string v1, "start to execute mainInteractors initMigrateData()"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2062
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->m()V

    goto/16 :goto_1

    .line 2066
    :sswitch_2d
    const-string v0, "Login_MainActivity"

    const-string v1, "Receive ConstantValues.MSG_INIT_PERSONAL_DATA"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2067
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 2068
    const-string v0, "Login_MainActivity"

    const-string v1, "start to init pullAchievement and initHWSmartInteract"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2069
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->z()V

    .line 2070
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->H()V

    .line 2071
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->y()V

    .line 2072
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->x()V

    .line 2073
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->O()V

    goto/16 :goto_1

    .line 2078
    :sswitch_2e
    const-string v0, "Login_MainActivityaaaaaaaaaaaaaaaa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter check dfx "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2079
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_1

    .line 2088
    :sswitch_2f
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BINDING_DEVICE_UPLOAD_TO_ODMF"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2089
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "SAVE_BIND_TO_ODMF"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 2090
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SAVE_BIND_TO_ODMF_FLAG ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v2}, Lcom/huawei/health/MainActivity;->L(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2091
    const-string v0, ""

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->L(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2092
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SAVE_BIND_TO_ODMF"

    const-string v3, "TRUE"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2093
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/MainActivity;->d()V

    .line 2099
    :cond_c
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_8
        0x2 -> :sswitch_9
        0x3 -> :sswitch_a
        0x4 -> :sswitch_0
        0x6 -> :sswitch_b
        0x7 -> :sswitch_c
        0x8 -> :sswitch_2
        0x9 -> :sswitch_3
        0xa -> :sswitch_4
        0xb -> :sswitch_5
        0xc -> :sswitch_6
        0xc8 -> :sswitch_22
        0xc9 -> :sswitch_d
        0xca -> :sswitch_e
        0xcb -> :sswitch_f
        0xcc -> :sswitch_1f
        0x12c -> :sswitch_23
        0xfa7 -> :sswitch_11
        0xfa8 -> :sswitch_12
        0xfa9 -> :sswitch_13
        0xfaa -> :sswitch_15
        0xfab -> :sswitch_16
        0xfac -> :sswitch_18
        0xfad -> :sswitch_1e
        0xfae -> :sswitch_17
        0xfb1 -> :sswitch_1d
        0x1395 -> :sswitch_19
        0x1396 -> :sswitch_1a
        0x1398 -> :sswitch_1b
        0x1399 -> :sswitch_1c
        0x139b -> :sswitch_10
        0x139c -> :sswitch_21
        0x139d -> :sswitch_1
        0x1771 -> :sswitch_20
        0x1772 -> :sswitch_25
        0x1776 -> :sswitch_29
        0x1777 -> :sswitch_2a
        0x1778 -> :sswitch_2b
        0x1838 -> :sswitch_24
        0x189c -> :sswitch_2e
        0x1900 -> :sswitch_2f
        0x1f42 -> :sswitch_2c
        0x1f43 -> :sswitch_2d
        0x2711 -> :sswitch_27
        0x2712 -> :sswitch_26
        0x2713 -> :sswitch_28
        0x2766 -> :sswitch_7
        0x9c9b -> :sswitch_14
    .end sparse-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1727
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1728
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 1729
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg.what = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1732
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1734
    :goto_0
    return-void
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 1720
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/MainActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/MainActivity$h;->c(Lcom/huawei/health/MainActivity;Landroid/os/Message;)V

    return-void
.end method
