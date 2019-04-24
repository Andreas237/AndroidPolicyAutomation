.class public Lcom/usebutton/sdk/internal/models/Browser;
.super Ljava/lang/Object;
.source "Browser.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Browser;",
            ">;"
        }
    .end annotation
.end field

.field public static final TARGET_BROWSER:Ljava/lang/String; = "browser"

.field public static final TARGET_WEBVIEW:Ljava/lang/String; = "webview"

.field public static final TARGET_WEBVIEW_ONLY:Ljava/lang/String; = "webview-only"


# instance fields
.field private final action:Lcom/usebutton/sdk/internal/models/Text;

.field private final browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

.field private final installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

.field private final primaryColor:I

.field private final subtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private final target:Ljava/lang/String;

.field private final title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 67
    new-instance v0, Lcom/usebutton/sdk/internal/models/Browser$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Browser$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Browser;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/InstallSheet;Lcom/usebutton/sdk/internal/models/BrowserCardMap;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput p1, p0, Lcom/usebutton/sdk/internal/models/Browser;->primaryColor:I

    .line 33
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/Browser;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 35
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/Browser;->subtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 36
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/Browser;->action:Lcom/usebutton/sdk/internal/models/Text;

    .line 37
    iput-object p6, p0, Lcom/usebutton/sdk/internal/models/Browser;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    .line 38
    iput-object p7, p0, Lcom/usebutton/sdk/internal/models/Browser;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->primaryColor:I

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    .line 44
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 45
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->subtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 46
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->action:Lcom/usebutton/sdk/internal/models/Text;

    .line 47
    const-class v0, Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/InstallSheet;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    .line 48
    const-class v0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Browser;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/BrowserDTO;Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/Browser;
    .locals 9
    .param p0    # Lcom/usebutton/sdk/internal/api/models/BrowserDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    .line 58
    new-instance v4, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v0

    invoke-direct {v4, v0, p2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    .line 59
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->actionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    invoke-static {p2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    .line 60
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->installSheet:Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;

    invoke-static {p2}, Lcom/usebutton/sdk/internal/models/InstallSheet;->fromDTO(Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;)Lcom/usebutton/sdk/internal/models/InstallSheet;

    move-result-object v7

    .line 61
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->browserCardMapDTO:Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;

    invoke-static {p2}, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->fromDTO(Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;)Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    move-result-object v8

    .line 63
    new-instance p2, Lcom/usebutton/sdk/internal/models/Browser;

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->primaryColor:Ljava/lang/String;

    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v2

    move-object v1, p2

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/usebutton/sdk/internal/models/Browser;-><init>(ILjava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/InstallSheet;Lcom/usebutton/sdk/internal/models/BrowserCardMap;)V

    return-object p2
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAction()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->action:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getCardsMap()Lcom/usebutton/sdk/internal/models/BrowserCardMap;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    return-object v0
.end method

.method public getInstallSheet()Lcom/usebutton/sdk/internal/models/InstallSheet;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    return-object v0
.end method

.method public getPrimaryColor()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->primaryColor:I

    return v0
.end method

.method public getSubtitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->subtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->title:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public isTargetBrowser()Z
    .locals 2

    const-string v0, "browser"

    .line 134
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isTargetWebView()Z
    .locals 2

    const-string/jumbo v0, "webview"

    .line 138
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isTargetWebViewOnly()Z
    .locals 2

    const-string/jumbo v0, "webview-only"

    .line 142
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Browser{primaryColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->primaryColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", target=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", title=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/Browser;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", subtitle=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/Browser;->subtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", action=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/Browser;->action:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", installSheet=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/Browser;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", cards=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Browser;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 111
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->primaryColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->target:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->subtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->action:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Browser;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
