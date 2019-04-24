.class public Lo/bhs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/text/Editable;)Z
    .locals 3

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-interface {p0}, Landroid/text/Editable;->clear()V

    .line 23
    const/4 v1, 0x1

    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2, p0}, Lo/bhs;->e(Ljava/lang/String;Landroid/text/Editable;)V

    .line 28
    :cond_1
    :goto_0
    return v1
.end method

.method public static e(Ljava/lang/String;Landroid/text/Editable;)V
    .locals 4

    .line 38
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 39
    :cond_0
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_2

    .line 44
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_2
    if-lez v3, :cond_3

    .line 47
    const/4 v0, 0x0

    invoke-interface {p1, v0, v3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 49
    :cond_3
    return-void
.end method
