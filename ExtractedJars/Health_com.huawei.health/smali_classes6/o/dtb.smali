.class public Lo/dtb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/widget/EditText;Lo/dsz;)V
    .locals 1

    .line 65
    new-instance v0, Lo/dtb$2;

    invoke-direct {v0, p1}, Lo/dtb$2;-><init>(Lo/dsz;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 86
    return-void
.end method

.method public static e(Landroid/widget/TextView;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 45
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-static {v1}, Lo/dtc;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    const-string v0, "NULL"

    return-object v0

    .line 51
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "YES"

    return-object v0

    .line 57
    :cond_1
    const-string v0, "NO"

    return-object v0
.end method
