.class public Lo/emv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 52
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 53
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 54
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 55
    return-void
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 2

    .line 38
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    .line 39
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(I)V

    .line 40
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 41
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 24
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 25
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 27
    return-void
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 2

    .line 66
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    .line 67
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(I)V

    .line 68
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 69
    return-void
.end method
