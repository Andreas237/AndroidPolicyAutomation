.class public Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;
.super Ljava/lang/Object;
.source "SKPhoneNumberFormattingTextWatcher.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private country:I

.field private lock:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;->country:I

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 39
    monitor-enter p0

    .line 40
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;->lock:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;->lock:Z

    .line 42
    iget v0, p0, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;->country:I

    invoke-static {p1, v0}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberUtils;->formatNumber(Landroid/text/Editable;I)V

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;->lock:Z

    .line 45
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
