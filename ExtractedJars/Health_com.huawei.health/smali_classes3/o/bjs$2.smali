.class Lo/bjs$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjs;->d(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic d:Lo/bjs;


# direct methods
.method constructor <init>(Lo/bjs;J)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/bjs$2;->d:Lo/bjs;

    iput-wide p2, p0, Lo/bjs$2;->b:J

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Integer;)V
    .locals 7

    .line 179
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 180
    iget-object v0, p0, Lo/bjs$2;->d:Lo/bjs;

    invoke-static {v0}, Lo/bjs;->b(Lo/bjs;)Landroid/widget/ImageView;

    move-result-object v0

    iget-wide v1, p0, Lo/bjs$2;->b:J

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 181
    iget-object v0, p0, Lo/bjs$2;->d:Lo/bjs;

    invoke-static {v0}, Lo/bjs;->a(Lo/bjs;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lo/bjs$2;->d:Lo/bjs;

    invoke-static {v0}, Lo/bjs;->a(Lo/bjs;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bjs$2;->d:Lo/bjs;

    invoke-static {v1}, Lo/bjs;->d(Lo/bjs;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_group_member_counts:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 183
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 182
    invoke-virtual {v1, v2, v6, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    return-void
.end method

.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 5

    .line 170
    const/4 v3, 0x0

    .line 171
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lo/bjs$2;->b:J

    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v4

    .line 173
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 166
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bjs$2;->d([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 166
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lo/bjs$2;->a(Ljava/lang/Integer;)V

    return-void
.end method
