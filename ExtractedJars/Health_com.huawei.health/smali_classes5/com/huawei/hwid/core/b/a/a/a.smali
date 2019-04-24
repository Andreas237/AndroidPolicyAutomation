.class public Lcom/huawei/hwid/core/b/a/a/a;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/a$a;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field h:I

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:Z

.field n:Z

.field o:Lcom/huawei/hwid/core/datatype/DeviceInfo;

.field p:Lcom/huawei/hwid/core/datatype/UserAccountInfo;

.field q:Lcom/huawei/hwid/core/datatype/TmemberRight;

.field r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Lcom/huawei/hwid/core/datatype/UserInfo;

.field private v:Lcom/huawei/hwid/core/datatype/UserLoginInfo;

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;"
        }
    .end annotation
.end field

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/TmemberRight;>;"
        }
    .end annotation
.end field

.field private z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/ChildrenInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 97
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/getUserInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->A:Ljava/lang/String;

    .line 98
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/a;->b(Z)V

    .line 99
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 347
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/getUserInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->A:Ljava/lang/String;

    .line 348
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/a;->b(Z)V

    .line 349
    invoke-virtual {p0, p2}, Lcom/huawei/hwid/core/b/a/a/a;->f(Ljava/lang/String;)V

    .line 350
    invoke-virtual {p0, p3}, Lcom/huawei/hwid/core/b/a/a/a;->g(Ljava/lang/String;)V

    .line 351
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/a;->a(Z)V

    .line 352
    return-void
.end method

.method private F()V
    .locals 4

    .line 209
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 210
    return-void

    .line 212
    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 213
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    .line 214
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    const-string v0, "5"

    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountState()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->B:Ljava/lang/String;

    .line 216
    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->C:Ljava/lang/String;

    goto :goto_1

    .line 217
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const-string v0, "6"

    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 218
    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountState()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->E:Ljava/lang/String;

    .line 219
    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->D:Ljava/lang/String;

    .line 212
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 223
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 130
    const-string v0, "userID"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->m:Z

    if-nez v0, :cond_0

    .line 131
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->s:Ljava/lang/String;

    goto/16 :goto_0

    .line 135
    :cond_0
    const-string v0, "userInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->u:Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->i:Z

    goto/16 :goto_0

    .line 138
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->i:Z

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->u:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getUserInfoIntag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 140
    :cond_2
    const-string v0, "userLoginInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->v:Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    .line 142
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->j:Z

    goto :goto_0

    .line 143
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->j:Z

    if-eqz v0, :cond_4

    .line 144
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->v:Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->getUserLoginInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)V

    goto :goto_0

    .line 145
    :cond_4
    const-string v0, "deviceIDList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->w:Ljava/util/ArrayList;

    .line 147
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->k:Z

    goto :goto_0

    .line 148
    :cond_5
    const-string v0, "DeviceInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 149
    new-instance v0, Lcom/huawei/hwid/core/datatype/DeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->o:Lcom/huawei/hwid/core/datatype/DeviceInfo;

    goto :goto_0

    .line 150
    :cond_6
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->k:Z

    if-eqz v0, :cond_7

    .line 151
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->o:Lcom/huawei/hwid/core/datatype/DeviceInfo;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->getDeviceInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_7
    const-string v0, "userAcctInfoList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->l:Z

    goto :goto_0

    .line 156
    :cond_8
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/core/b/a/a/a;->b(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 158
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 161
    const-string v0, "userAcctInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->p:Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    goto/16 :goto_0

    .line 163
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->l:Z

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->p:Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccInfoInTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 166
    :cond_1
    const-string v0, "memberRightList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->y:Ljava/util/ArrayList;

    .line 168
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->m:Z

    goto :goto_0

    .line 169
    :cond_2
    const-string v0, "memberRight"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 170
    new-instance v0, Lcom/huawei/hwid/core/datatype/TmemberRight;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/TmemberRight;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->q:Lcom/huawei/hwid/core/datatype/TmemberRight;

    goto :goto_0

    .line 171
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->m:Z

    if-eqz v0, :cond_4

    .line 172
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->q:Lcom/huawei/hwid/core/datatype/TmemberRight;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/TmemberRight;->a(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/TmemberRight;Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_4
    const-string v0, "childrenList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->z:Ljava/util/ArrayList;

    .line 175
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->n:Z

    goto :goto_0

    .line 176
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    const-string v0, "children"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 177
    new-instance v0, Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    goto :goto_0

    .line 178
    :cond_6
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->n:Z

    if-eqz v0, :cond_7

    .line 179
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    invoke-static {p2, v0, p1}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)V

    .line 181
    :cond_7
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    const-string v0, "userInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->i:Z

    goto/16 :goto_0

    .line 186
    :cond_0
    const-string v0, "userLoginInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->j:Z

    goto/16 :goto_0

    .line 188
    :cond_1
    const-string v0, "deviceIDList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->k:Z

    goto/16 :goto_0

    .line 190
    :cond_2
    const-string v0, "DeviceInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->w:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->o:Lcom/huawei/hwid/core/datatype/DeviceInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 192
    :cond_3
    const-string v0, "userAcctInfo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 193
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->p:Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 194
    :cond_4
    const-string v0, "userAcctInfoList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 195
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->l:Z

    goto :goto_0

    .line 197
    :cond_5
    const-string v0, "memberRight"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 198
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->y:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->q:Lcom/huawei/hwid/core/datatype/TmemberRight;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    :cond_6
    const-string v0, "memberRightList"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 200
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->m:Z

    goto :goto_0

    .line 201
    :cond_7
    const-string v0, "children"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 202
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->z:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 203
    :cond_8
    const-string v0, "result"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 204
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a/a;->F()V

    .line 206
    :cond_9
    :goto_0
    return-void
.end method


# virtual methods
.method public A()Lcom/huawei/hwid/core/datatype/UserLoginInfo;
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->v:Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    return-object v0
.end method

.method public B()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/DeviceInfo;>;"
        }
    .end annotation

    .line 295
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->w:Ljava/util/ArrayList;

    return-object v0
.end method

.method public C()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;"
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->x:Ljava/util/ArrayList;

    return-object v0
.end method

.method public D()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/TmemberRight;>;"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->y:Ljava/util/ArrayList;

    return-object v0
.end method

.method public E()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/ChildrenInfo;>;"
        }
    .end annotation

    .line 331
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 356
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/a$a;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hwid/core/b/a/a/a$a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwid/core/b/a/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 357
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 227
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/m;->a([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 228
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->h:I

    .line 229
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->i:Z

    .line 230
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->j:Z

    .line 231
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->k:Z

    .line 232
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->l:Z

    .line 233
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->m:Z

    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->n:Z

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->o:Lcom/huawei/hwid/core/datatype/DeviceInfo;

    .line 236
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->p:Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    .line 237
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->q:Lcom/huawei/hwid/core/datatype/TmemberRight;

    .line 238
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->r:Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    .line 240
    :goto_0
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->h:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_4

    .line 241
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 243
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->h:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 245
    :pswitch_0
    goto :goto_1

    .line 247
    :pswitch_1
    const-string v0, "result"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->b:I

    .line 251
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 252
    invoke-direct {p0, v3, v2}, Lcom/huawei/hwid/core/b/a/a/a;->a(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 254
    :cond_1
    const-string v0, "errorCode"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 255
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->c:I

    goto :goto_1

    .line 256
    :cond_2
    const-string v0, "errorDesc"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 257
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->d:Ljava/lang/String;

    goto :goto_1

    .line 263
    :pswitch_2
    invoke-direct {p0, v3, v2}, Lcom/huawei/hwid/core/b/a/a/a;->c(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 264
    .line 269
    :cond_3
    :goto_1
    :pswitch_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->h:I

    .line 270
    goto/16 :goto_0

    .line 271
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 103
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 105
    :try_start_0
    invoke-static {v2}, Lcom/huawei/hwid/core/d/m;->a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v3

    .line 106
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 107
    const-string v0, "GetUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 109
    const-string v0, "version"

    const-string v1, "12000"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->s:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "queryRangeFlag"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/a;->t:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v0, "GetUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 114
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 116
    const-string v0, "UTF-8"

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 118
    const-string v0, "GetUserInfoRequest"

    const-string v1, "packedString"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    move-object v5, v4

    .line 122
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    goto :goto_0

    .line 123
    :catch_0
    move-exception v6

    .line 124
    const-string v0, "GetUserInfoRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_0
    return-object v5

    .line 121
    :catchall_0
    move-exception v7

    .line 122
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 125
    goto :goto_1

    .line 123
    :catch_1
    move-exception v8

    .line 124
    const-string v0, "GetUserInfoRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :goto_1
    throw v7
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->A:Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/a;->s:Ljava/lang/String;

    .line 280
    return-void
.end method

.method public g()Landroid/os/Bundle;
    .locals 3

    .line 337
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v2

    .line 338
    const-string v0, "accountsInfo"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->C()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 339
    const-string v0, "devicesInfo"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->B()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 340
    const-string v0, "memberRights"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->D()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 341
    const-string v0, "childrenInfo"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->E()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 342
    const-string v0, "userInfo"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->z()Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 343
    const-string v0, "userLoginInfo"

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/a;->A()Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 344
    return-object v2
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/a;->t:Ljava/lang/String;

    .line 284
    return-void
.end method

.method public z()Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a;->u:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object v0
.end method
