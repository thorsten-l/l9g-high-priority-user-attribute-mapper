/*
 * Copyright 2024 Thorsten Ludewig (t.ludewig@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package l9g.keycloak.mapper;

import org.keycloak.protocol.oidc.mappers.UserAttributeMapper;

/**
 *
 * @author Thorsten Ludewig (t.ludewig@gmail.com)
 */
public class L9gUserAttributeMapper extends UserAttributeMapper
{
  @Override
  public String getId()
  {
    return "l9g-high-priority-user-attribute-mapper";
  }

  @Override
  public String getDisplayType()
  {
    return "L9G User Attribute";
  }

  @Override
  public String getHelpText()
  {
    return "L9G user attribute mapper with priority 90.";
  }

  @Override
  public int getPriority()
  {
    return 90;
  }

}
