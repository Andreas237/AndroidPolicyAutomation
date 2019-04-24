.class public Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;
.super Ljava/lang/Object;
.source "IbottaPhoneNumWatcher.java"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final FORMAT_A:Ljava/lang/String; = "$1"

.field private static final FORMAT_B:Ljava/lang/String; = "($1) $2"

.field private static final FORMAT_C:Ljava/lang/String; = "($1) $2-$3"

.field private static final REGEX_A:Ljava/lang/String; = "(\\d{1,3})"

.field private static final REGEX_B:Ljava/lang/String; = "(\\d{1,3})(\\d{1,3})"

.field private static final REGEX_C:Ljava/lang/String; = "(\\d{1,3})(\\d{1,3})(\\d+)"


# instance fields
.field private enforceLength:Z

.field private final etField:Landroid/widget/EditText;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private working:Z


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Lcom/ibotta/android/util/Formatting;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->enforceLength:Z

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->etField:Landroid/widget/EditText;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public declared-synchronized afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    monitor-enter p0

    .line 33
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->working:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->working:Z

    .line 36
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->enforceLength:Z

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->normalizePhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->normalizeToDigits(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 41
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    const-string v0, "(\\d{1,3})"

    const-string v1, "$1"

    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_2

    const-string v0, "(\\d{1,3})(\\d{1,3})"

    const-string v1, "($1) $2"

    goto :goto_1

    :cond_2
    const-string v0, "(\\d{1,3})(\\d{1,3})(\\d+)"

    const-string v1, "($1) $2-$3"

    .line 52
    :goto_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->etField:Landroid/widget/EditText;

    if-eqz v2, :cond_3

    .line 53
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->etField:Landroid/widget/EditText;

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->etField:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->etField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_3
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/misc/IbottaPhoneNumWatcher;->working:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
