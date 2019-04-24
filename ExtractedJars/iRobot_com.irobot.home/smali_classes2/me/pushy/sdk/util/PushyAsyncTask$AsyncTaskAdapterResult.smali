.class Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/pushy/sdk/util/PushyAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AsyncTaskAdapterResult"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final mData:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TData;"
        }
    .end annotation
.end field

.field final mTask:Lme/pushy/sdk/util/PushyAsyncTask;


# direct methods
.method varargs constructor <init>(Lme/pushy/sdk/util/PushyAsyncTask;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lme/pushy/sdk/util/PushyAsyncTask;",
            "[TData;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mTask:Lme/pushy/sdk/util/PushyAsyncTask;

    iput-object p2, p0, Lme/pushy/sdk/util/PushyAsyncTask$AsyncTaskAdapterResult;->mData:[Ljava/lang/Object;

    return-void
.end method
