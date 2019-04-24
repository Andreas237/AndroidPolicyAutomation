.class final Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
.source "$AutoValue_ImLoginPersistedState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private accountCreationMessageAlreadyShown:Ljava/lang/Boolean;

.field private fromCreate:Ljava/lang/Boolean;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;-><init>()V

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->retailerId:Ljava/lang/Integer;

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isAccountCreationMessageAlreadyShown()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown:Ljava/lang/Boolean;

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isFromCreate()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->fromCreate:Ljava/lang/Boolean;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$1;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;)V

    return-void
.end method


# virtual methods
.method public accountCreationMessageAlreadyShown(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    .locals 0

    .line 96
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown:Ljava/lang/Boolean;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;
    .locals 4

    const-string v0, ""

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 110
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " accountCreationMessageAlreadyShown"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->fromCreate:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " fromCreate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->retailerId:Ljava/lang/Integer;

    .line 120
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->accountCreationMessageAlreadyShown:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->fromCreate:Ljava/lang/Boolean;

    .line 122
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginPersistedState;-><init>(IZZ)V

    return-object v0

    .line 117
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public fromCreate(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    .locals 0

    .line 101
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->fromCreate:Ljava/lang/Boolean;

    return-object p0
.end method

.method public retailerId(I)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    .locals 0

    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method
