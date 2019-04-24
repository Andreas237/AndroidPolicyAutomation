.class interface abstract Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;
.super Ljava/lang/Object;


# static fields
.field public static final LAST_TIME_CHECKED_DEFAULT:I = -0x1


# virtual methods
.method public abstract lastCheckedTime()J
.end method

.method public abstract lastCheckedTime(J)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeLastCheckedTime()Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method
