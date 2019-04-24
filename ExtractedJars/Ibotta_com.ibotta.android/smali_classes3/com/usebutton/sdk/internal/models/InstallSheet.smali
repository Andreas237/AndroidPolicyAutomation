.class public Lcom/usebutton/sdk/internal/models/InstallSheet;
.super Ljava/lang/Object;
.source "InstallSheet.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/InstallSheet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final appActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private final appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

.field private final appTitleText:Lcom/usebutton/sdk/internal/models/Text;

.field private final titleText:Lcom/usebutton/sdk/internal/models/Text;

.field private final webActionText:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 89
    new-instance v0, Lcom/usebutton/sdk/internal/models/InstallSheet$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/InstallSheet$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/InstallSheet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 68
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 69
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 70
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 71
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 27
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 28
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    .line 29
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 30
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;)Lcom/usebutton/sdk/internal/models/InstallSheet;
    .locals 7
    .param p0    # Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 39
    :cond_0
    new-instance v6, Lcom/usebutton/sdk/internal/models/InstallSheet;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appTitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 40
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appSubtitleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 41
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->appActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 42
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/InstallSheetDTO;->webActionText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 43
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/models/InstallSheet;-><init>(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v6
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_5

    .line 110
    :cond_1
    check-cast p1, Lcom/usebutton/sdk/internal/models/InstallSheet;

    .line 112
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 115
    :cond_3
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 118
    :cond_5
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    .line 121
    :cond_7
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_8
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_9

    :goto_3
    return v1

    .line 124
    :cond_9
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_a

    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, p1}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_a
    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-nez p1, :cond_b

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    :goto_4
    return v0

    :cond_c
    :goto_5
    return v1
.end method

.method public getAppActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getAppSubtitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getAppTitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitleText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getWebActionText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 130
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 131
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 132
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 133
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v1

    :cond_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InstallSheet{titleText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appTitleText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appSubtitleText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appActionText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", webActionText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 81
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->titleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 82
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appTitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 83
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appSubtitleText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 84
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->appActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 85
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/InstallSheet;->webActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    return-void
.end method
