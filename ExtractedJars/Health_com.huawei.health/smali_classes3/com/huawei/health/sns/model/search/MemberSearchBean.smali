.class public Lcom/huawei/health/sns/model/search/MemberSearchBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/search/MemberSearchBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private matchCount:I

.field private matchIndex:I

.field private matchType:I

.field private matchedPinyin:Ljava/lang/String;

.field private searchKey:Ljava/lang/String;

.field private searchType:I

.field private subTips:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 191
    new-instance v0, Lcom/huawei/health/sns/model/search/MemberSearchBean$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTitle:Ljava/lang/String;

    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchKey:Ljava/lang/String;

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchedPinyin:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchIndex:I

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchCount:I

    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchType:I

    .line 214
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTips:Ljava/lang/String;

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchType:I

    .line 216
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 175
    const/4 v0, 0x0

    return v0
.end method

.method public getMatchCount()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchCount:I

    .line 109
    return v0
.end method

.method public getMatchIndex()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchIndex:I

    .line 92
    return v0
.end method

.method public getMatchType()I
    .locals 1

    .line 163
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchType:I

    .line 164
    return v0
.end method

.method public getMatchedPinyin()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchedPinyin:Ljava/lang/String;

    .line 131
    return-object v0
.end method

.method public getSearchKey()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchKey:Ljava/lang/String;

    .line 120
    return-object v0
.end method

.method public getSearchType()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchType:I

    .line 142
    return v0
.end method

.method public getSubTips()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTips:Ljava/lang/String;

    .line 153
    return-object v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTitle:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public setMatchCount(I)V
    .locals 0

    .line 114
    iput p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchCount:I

    .line 115
    return-void
.end method

.method public setMatchIndex(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchIndex:I

    .line 104
    return-void
.end method

.method public setMatchIndexCount(II)V
    .locals 0

    .line 97
    iput p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchIndex:I

    .line 98
    iput p2, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchCount:I

    .line 99
    return-void
.end method

.method public setMatchType(I)V
    .locals 0

    .line 169
    iput p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchType:I

    .line 170
    return-void
.end method

.method public setMatchedPinyin(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchedPinyin:Ljava/lang/String;

    .line 137
    return-void
.end method

.method public setSearchKey(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchKey:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setSearchKeyType(Ljava/lang/String;I)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchKey:Ljava/lang/String;

    .line 81
    iput p2, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchType:I

    .line 82
    return-void
.end method

.method public setSearchType(I)V
    .locals 0

    .line 147
    iput p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchType:I

    .line 148
    return-void
.end method

.method public setSubTips(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTips:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTitle:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setSubTitlePinyinType(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTitle:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchedPinyin:Ljava/lang/String;

    .line 75
    iput p3, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchType:I

    .line 76
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchedPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 184
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchIndex:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->searchType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->subTips:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    iget v0, p0, Lcom/huawei/health/sns/model/search/MemberSearchBean;->matchType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    return-void
.end method
