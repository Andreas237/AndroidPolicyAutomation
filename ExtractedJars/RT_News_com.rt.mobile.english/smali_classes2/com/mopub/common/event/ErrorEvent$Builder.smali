.class public Lcom/mopub/common/event/ErrorEvent$Builder;
.super Lcom/mopub/common/event/BaseEvent$Builder;
.source "ErrorEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/ErrorEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mErrorClassName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorExceptionClassName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorFileName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorLineNumber:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorMessage:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorMethodName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mErrorStackTrace:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;D)V
    .locals 6
    .param p1    # Lcom/mopub/common/event/BaseEvent$Name;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/event/BaseEvent$Category;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 91
    sget-object v1, Lcom/mopub/common/event/BaseEvent$ScribeCategory;->EXCHANGE_CLIENT_ERROR:Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/mopub/common/event/BaseEvent$Builder;-><init>(Lcom/mopub/common/event/BaseEvent$ScribeCategory;Lcom/mopub/common/event/BaseEvent$Name;Lcom/mopub/common/event/BaseEvent$Category;D)V

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorExceptionClassName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMessage:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorStackTrace:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorFileName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorClassName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMethodName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 81
    iget-object p0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorLineNumber:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic build()Lcom/mopub/common/event/BaseEvent;
    .locals 1

    .line 81
    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent$Builder;->build()Lcom/mopub/common/event/ErrorEvent;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/mopub/common/event/ErrorEvent;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 157
    new-instance v0, Lcom/mopub/common/event/ErrorEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/common/event/ErrorEvent;-><init>(Lcom/mopub/common/event/ErrorEvent$Builder;Lcom/mopub/common/event/ErrorEvent$1;)V

    return-object v0
.end method

.method public withErrorClassName(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 120
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorClassName:Ljava/lang/String;

    return-object p0
.end method

.method public withErrorExceptionClassName(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 96
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorExceptionClassName:Ljava/lang/String;

    return-object p0
.end method

.method public withErrorFileName(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 114
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorFileName:Ljava/lang/String;

    return-object p0
.end method

.method public withErrorLineNumber(Ljava/lang/Integer;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 132
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorLineNumber:Ljava/lang/Integer;

    return-object p0
.end method

.method public withErrorMessage(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 102
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMessage:Ljava/lang/String;

    return-object p0
.end method

.method public withErrorMethodName(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 126
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMethodName:Ljava/lang/String;

    return-object p0
.end method

.method public withErrorStackTrace(Ljava/lang/String;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 108
    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorStackTrace:Ljava/lang/String;

    return-object p0
.end method

.method public withException(Ljava/lang/Exception;)Lcom/mopub/common/event/ErrorEvent$Builder;
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorExceptionClassName:Ljava/lang/String;

    .line 139
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMessage:Ljava/lang/String;

    .line 141
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 142
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-static {p1, v1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V

    .line 143
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorStackTrace:Ljava/lang/String;

    .line 145
    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    .line 146
    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorFileName:Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorClassName:Ljava/lang/String;

    .line 148
    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorMethodName:Ljava/lang/String;

    .line 149
    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent$Builder;->mErrorLineNumber:Ljava/lang/Integer;

    :cond_0
    return-object p0
.end method
