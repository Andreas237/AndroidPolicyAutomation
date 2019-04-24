.class public Lcom/shopkick/app/debug/DebugLogScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "DebugLogScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final EMAIL_LIST:[Ljava/lang/String;

.field public static final GEOFENCE_TAG:Ljava/lang/String; = "GEOFENCE2"

.field public static final PRESENCE_TAG:Ljava/lang/String; = "presence"

.field public static final TAG_FILTER:Ljava/lang/String; = "tagFilter"

.field public static final WALKIN_TAG:Ljava/lang/String; = "walkin"


# instance fields
.field private clearLogsButton:Landroid/widget/Button;

.field private debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

.field private emailLogsButton:Landroid/widget/Button;

.field private freezeLogs:Landroid/widget/Button;

.field private logcat:Landroid/widget/TextView;

.field private pid:I

.field private presenceController:Lcom/shopkick/app/presence/PresenceController;

.field private refreshLogsButton:Landroid/widget/Button;

.field private tagFilter:Ljava/lang/String;

.field private tagFilterQuery:Landroid/widget/EditText;

.field private userId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "james@shopkick.com"

    .line 34
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/debug/DebugLogScreen;->EMAIL_LIST:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private clear()V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string v1, "logcat"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "logcat -c"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string v1, "presence"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->resetPdEvents()V

    goto :goto_0

    .line 130
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string/jumbo v1, "walkin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->clearWalkinHistory()V

    goto :goto_0

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/debug/DebugLogManager;->clear(Ljava/lang/String;)V

    .line 135
    :catch_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private email()V
    .locals 3

    .line 148
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 150
    sget-object v1, Lcom/shopkick/app/debug/DebugLogScreen;->EMAIL_LIST:[Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "android.intent.extra.EMAIL"

    .line 151
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Logs: user id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->userId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.SUBJECT"

    .line 155
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "android.intent.extra.TEXT"

    .line 159
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const-string v1, "android.intent.extra.TEXT"

    const-string/jumbo v2, "uh oh couldn\'t get logs try again"

    .line 161
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    const-string v1, "message/rfc822"

    .line 164
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 165
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private getLogcat(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 170
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p1

    .line 175
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 177
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 180
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/shopkick/app/debug/DebugLogScreen;->pid:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 181
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 184
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic lambda$refresh$7(Lcom/shopkick/app/debug/DebugLogScreen;)V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilterQuery:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string v1, "logcat"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    const-string v1, "logcat -d -v time"

    invoke-direct {p0, v1}, Lcom/shopkick/app/debug/DebugLogScreen;->getLogcat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string v1, "logcat "

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/shopkick/app/debug/DebugLogScreen;->getLogcat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string v1, "presence"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v1}, Lcom/shopkick/app/presence/PresenceController;->getPdEvents()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 113
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    const-string/jumbo v1, "walkin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v1}, Lcom/shopkick/app/presence/PresenceController;->getWalkinHistory()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 116
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-object v2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/debug/DebugLogManager;->getLogs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private toggleFreeze()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-boolean v1, v0, Lcom/shopkick/app/debug/DebugLogManager;->freezeLogs:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Lcom/shopkick/app/debug/DebugLogManager;->freezeLogs:Z

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-boolean v0, v0, Lcom/shopkick/app/debug/DebugLogManager;->freezeLogs:Z

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->freezeLogs:Landroid/widget/Button;

    const-string v1, "Unfreeze"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->freezeLogs:Landroid/widget/Button;

    const-string v1, "Freeze"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p2, 0x7f0c0092

    const/4 p3, 0x0

    .line 63
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090449

    .line 65
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilterQuery:Landroid/widget/EditText;

    const p2, 0x7f090448

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    const p2, 0x7f0905a2

    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->refreshLogsButton:Landroid/widget/Button;

    .line 69
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->refreshLogsButton:Landroid/widget/Button;

    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09010a

    .line 70
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->clearLogsButton:Landroid/widget/Button;

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->clearLogsButton:Landroid/widget/Button;

    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09023c

    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->emailLogsButton:Landroid/widget/Button;

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->emailLogsButton:Landroid/widget/Button;

    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09029c

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->freezeLogs:Landroid/widget/Button;

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->freezeLogs:Landroid/widget/Button;

    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->pid:I

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilterQuery:Landroid/widget/EditText;

    iget-object p3, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilterQuery:Landroid/widget/EditText;

    const/16 p3, 0x11

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setGravity(I)V

    .line 81
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    const/high16 p3, 0x41600000    # 14.0f

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 82
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugLogScreen;->logcat:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    invoke-virtual {p3, v0}, Lcom/shopkick/app/debug/DebugLogManager;->getLogs(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iput-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 53
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    iput-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->userId:Ljava/lang/String;

    if-eqz p2, :cond_0

    const-string/jumbo p1, "tagFilter"

    .line 56
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilter:Ljava/lang/String;

    .line 58
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugLogScreen;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/debug/DebugLogManager;->setDebugLogScreen(Lcom/shopkick/app/debug/DebugLogScreen;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->tagFilterQuery:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 90
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->hideKeyboard()V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->refreshLogsButton:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 92
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->refresh()V

    goto :goto_0

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->clearLogsButton:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 94
    invoke-direct {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->clear()V

    goto :goto_0

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->emailLogsButton:Landroid/widget/Button;

    if-ne p1, v0, :cond_2

    .line 96
    invoke-direct {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->email()V

    goto :goto_0

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugLogScreen;->freezeLogs:Landroid/widget/Button;

    if-ne p1, v0, :cond_3

    .line 98
    invoke-direct {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->toggleFreeze()V

    :cond_3
    :goto_0
    return-void
.end method

.method public refresh()V
    .locals 2

    .line 103
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugLogScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 105
    new-instance v1, Lcom/shopkick/app/debug/-$$Lambda$DebugLogScreen$QuJRc-foud3dMKPFjF3KZ6pPeu0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/debug/-$$Lambda$DebugLogScreen$QuJRc-foud3dMKPFjF3KZ6pPeu0;-><init>(Lcom/shopkick/app/debug/DebugLogScreen;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
